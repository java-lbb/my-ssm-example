package com.lb.ssm.result;

import lombok.Data;
import lombok.Getter;

@Getter
public enum ResponseCode {

    // 业务代码执行成功
    SUCCESS(20000, "success"),
    ADD_USERINFO_SUCCESS(20000," add user information successfully!"),
    ADD_ORDERS_SUCCESS(20000,"add orders successfully"),


    // 业务代码执行失败
    ERROR(40000,"error"),
    ADD_USER_AND_DETAIL_ERROR(40001,"Failed to add user information"),
    ADD_ORDERS_ERROR(40002,"Failed to add orders"),
    QUERY_USERINFO_ERROR(20000,"Failed to query user information ");

    private final int status;
    private final String msg;

    ResponseCode(int status, String msg) {
        this.msg = msg;
        this.status = status;
    }
}
