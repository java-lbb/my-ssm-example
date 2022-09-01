package com.lb.ssm.common.exception;

import com.lb.ssm.result.ResponseCode;
import org.springframework.stereotype.Component;


@Component
public class ControllerException extends BaseException {

    public ControllerException() {
    }

    public ControllerException(ResponseCode responseCode){
        super(responseCode);
    }
}
