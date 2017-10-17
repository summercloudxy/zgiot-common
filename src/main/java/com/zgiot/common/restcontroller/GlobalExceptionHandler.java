package com.zgiot.common.restcontroller;

import com.zgiot.common.constants.GlobalConstants;
import com.zgiot.common.exceptions.SysException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(value = SysException.class)
    public ServerResponse processEdpException(HttpServletRequest req, SysException e) {
        String reqIdStr = getReqId(req);
        logger.warn("Request '" + reqIdStr + "' failed: ");
        return ServerResponse.buildFromException(e);
    }

    @ExceptionHandler(value = Throwable.class)
    public ServerResponse processException(HttpServletRequest req, Throwable e) {
        String reqIdStr = getReqId(req);
        logger.warn("Request '" + reqIdStr + "' failed: ");
        return new ServerResponse(e.getMessage(), SysException.EC_UNKNOWN, null);
    }

    private String getReqId(HttpServletRequest req) {
        String reqIdStr = req.getHeader(GlobalConstants.REQUEST_ID_HEADER_KEY);
        if (reqIdStr == null) {
            reqIdStr = "";
        }
        return reqIdStr;
    }

}
