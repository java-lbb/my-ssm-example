package com.lb.ssm.common.handler;

import com.lb.ssm.common.exception.DaoException;
import com.lb.ssm.common.exception.ServiceException;
import com.lb.ssm.result.ResponseCode;
import com.lb.ssm.result.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public  ResponseResult<Object> handlerException(Exception exception){
        exception.printStackTrace();
        return  ResponseResult.error(ResponseCode.ERROR);
    }

    @ExceptionHandler(ServiceException.class)
    public  ResponseResult<Object> handlerException(ServiceException exception){
        exception.printStackTrace();
        return ResponseResult.error(exception.getResponseCode());
    }

    public ResponseResult<Object> handlerException(DaoException exception){
        exception.printStackTrace();
        return ResponseResult.error(exception.getResponseCode());
    }
}
