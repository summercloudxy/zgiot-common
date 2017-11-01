package com.zgiot.common.restcontroller;

import com.alibaba.fastjson.JSON;
import com.zgiot.common.reloader.Reloader;
import com.zgiot.common.reloader.ServerReloadManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/serverreload")
public class ServerReloadController {
    private static final Logger logger = LoggerFactory.getLogger(ServerReloadController.class);

    @RequestMapping(
            value = "/reloadall",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> reloadAll() {
        List<Reloader> objs = ServerReloadManager.getAllReloaders();
        List<String> names = new ArrayList<>(objs.size());
        for (Reloader r : objs) {
            names.add(r.getClass().getName());
            logger.info("Reloader run. (name=`{}`)", r.getClass().getName());
            try {
                r.reload();
            } catch (Exception e) {
                logger.error("Reloader error. (name=`{}`, msg=`{}`)"
                        , r.getClass().getName()
                        , e.getMessage());
            }
            logger.info("Reloader reloaded. (name=`{}`)", r.getClass().getName());
        }

        return new ResponseEntity<>(
                ServerResponse.buildOkJson(JSON.toJSONString(names))
                , HttpStatus.OK);
    }

}
