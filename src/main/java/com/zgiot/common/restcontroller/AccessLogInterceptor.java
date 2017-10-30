package com.zgiot.common.restcontroller;

import com.alibaba.fastjson.JSON;
import com.zgiot.common.constants.GlobalConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedHashMap;
import java.util.Map;

public class AccessLogInterceptor implements HandlerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(AccessLogInterceptor.class);
    private static final String START_FLAG="SF_REQ_START_MS";
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object o) throws Exception {

        if (logger.isInfoEnabled()){
            Map map = new LinkedHashMap<>();
            map.put("reqId", req.getHeader(GlobalConstants.REQUEST_ID_HEADER_KEY));
            map.put("from", req.getRemoteHost()+":"+req.getRemotePort());
            map.put("method", req.getMethod());
            map.put("uri", req.getRequestURI());
            map.put("query", req.getQueryString());
            map.put("len", req.getContentLengthLong());

            req.setAttribute(START_FLAG, System.currentTimeMillis());
            logger.info("Got Request: `{}`", JSON.toJSONString(map));
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest req, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        if (logger.isInfoEnabled()){
            String reqId = req.getHeader(GlobalConstants.REQUEST_ID_HEADER_KEY);
            long start = (long) req.getAttribute(START_FLAG);
            long ds = System.currentTimeMillis() - start;
            logger.info("End Request: reqId=`{}`, dMs=`{}`", reqId, ds);
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }
}
