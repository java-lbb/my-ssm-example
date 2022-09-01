package com.lb.ssm.common.vo;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserDetailVo {
    private Integer userId;
    private String username;
    private Integer age;
    private String phone;
    private String hobby;
}
