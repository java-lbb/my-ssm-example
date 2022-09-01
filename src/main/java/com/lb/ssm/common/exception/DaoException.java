package com.lb.ssm.common.exception;

import com.lb.ssm.result.ResponseCode;
import org.springframework.stereotype.Component;

@Component
public class DaoException extends BaseException{

    public DaoException() {
    }

    public DaoException(ResponseCode responseCode) {
        super(responseCode);
    }
}
