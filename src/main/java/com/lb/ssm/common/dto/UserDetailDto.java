package com.lb.ssm.common.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserDetailDto {
    private String username;
    private String password;
    private Integer age;
    private String  phone;
    private String hobby;
}
