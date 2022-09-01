package com.lb.ssm.common.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lb.ssm.entity.UserDetail;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Data
@Component
public class UserDetailAndOrdersVo {
    private Integer userId;
    private String username;
    private Integer age;
    private String phone;
    private String hobby;
    private List<OrdersVo> ordersVoList;

}
