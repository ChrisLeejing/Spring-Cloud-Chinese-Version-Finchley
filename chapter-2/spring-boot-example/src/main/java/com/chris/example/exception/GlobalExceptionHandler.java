package com.chris.example.exception;

import com.chris.example.response.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

/**
 * This is description.
 * ControllerAdvice: 拦截异常并统一处理
 *
 * @author Chris Lee
 * @date 2019/7/13 20:01
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseData defaultErrorHandler(HttpServletRequest request, Exception e) {
        log.error("", e);
        ResponseData responseData = new ResponseData();
        responseData.setMessage(e.getMessage());
        if (e instanceof NoHandlerFoundException) {
            responseData.setCode(404);
        } else {
            responseData.setCode(500);
        }
        responseData.setStatus(false);
        responseData.setData(null);
        return responseData;
    }
}
