package com.lb.ssm.mapper;

import com.lb.ssm.entity.Orders;
import org.apache.ibatis.annotations.Param;
import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.List;

public interface OrdersMapper {
    int insert(@Param("orders") Orders orders);
    ArrayList<Orders> select(@Param("userId")int userId);
    int update(@Param("orders") Orders orders);
}
