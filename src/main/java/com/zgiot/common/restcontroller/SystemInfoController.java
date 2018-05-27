package com.zgiot.common.restcontroller;


import com.zgiot.common.restcontroller.ServerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@RestController
@RequestMapping(value = "/system")
public class SystemInfoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SystemInfoController.class);

    @RequestMapping(
            value = "/version",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> getVersion() {
        Properties verProp = new Properties();
        InputStream inputestream = null;
        try {
            inputestream = SystemInfoController.class.getResourceAsStream("/VERSION");
            verProp.load(inputestream);
        } catch (IOException e) {
            return new ResponseEntity<>(
                    ServerResponse.buildOkJson(e.getMessage())
                    , HttpStatus.OK);
        } finally {
            try {
                inputestream.close();
            } catch (IOException e) {
                LOGGER.error(e.getMessage(), e);
            }
        }

        return new ResponseEntity<>(
                ServerResponse.buildOkJson(verProp)
                , HttpStatus.OK);
    }

}
