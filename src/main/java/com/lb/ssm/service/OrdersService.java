package com.lb.ssm.service;

import com.lb.ssm.common.dto.OrdersDto;
import com.lb.ssm.common.vo.OrdersVo;
import com.lb.ssm.entity.Orders;

import java.util.List;

public interface OrdersService {
    int addOrder(OrdersDto ordersDto);
    List<OrdersVo> getOrders(int userId);
    int updateOrders(Orders orders);
}
