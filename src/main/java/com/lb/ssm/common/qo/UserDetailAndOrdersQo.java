package com.lb.ssm.common.qo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserDetailAndOrdersQo {
    private String username;
    private String password;
}
