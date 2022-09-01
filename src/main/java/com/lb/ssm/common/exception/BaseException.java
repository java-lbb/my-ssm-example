package com.lb.ssm.common.exception;
import com.lb.ssm.result.ResponseCode;
import lombok.Getter;
import org.springframework.stereotype.Component;


@Component
@Getter
public class BaseException extends RuntimeException{
    private  ResponseCode responseCode;

    public BaseException(){
    }

    public BaseException(ResponseCode responseCode){
        super(responseCode.getMsg());
        this.responseCode =responseCode;
    }
}
