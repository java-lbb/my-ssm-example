package com.lb.ssm.common.exception;

import com.lb.ssm.result.ResponseCode;
import org.springframework.stereotype.Component;


@Component
public class ServiceException extends BaseException {

    public ServiceException() {
    }

    public ServiceException(ResponseCode responseCode){
        super(responseCode);
    }
}
