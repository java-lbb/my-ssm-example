package com.lb.ssm.common.dto;

import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class OrdersDto {
    private String username;
    private Integer number;
    private String detail;
}
