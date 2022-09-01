package com.lb.ssm.service.impl;

import com.lb.ssm.common.dto.OrdersDto;
import com.lb.ssm.common.vo.OrdersVo;
import com.lb.ssm.entity.Orders;
import com.lb.ssm.entity.User;
import com.lb.ssm.mapper.OrdersMapper;
import com.lb.ssm.mapper.UserMapper;
import com.lb.ssm.result.ResponseResult;
import com.lb.ssm.service.OrdersService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addOrder(OrdersDto ordersDto) {
        Orders orders = new Orders();
        User user = userMapper.select(ordersDto.getUsername());
        BeanUtils.copyProperties(ordersDto,orders);
        BeanUtils.copyProperties(user,orders);
        return ordersMapper.insert(orders);
    }

    @Override
    public List<OrdersVo> getOrders(int userId) {
        ArrayList<Orders> ordersList = ordersMapper.select(userId);
        List<OrdersVo> ordersVoList = new ArrayList<>();
        for (Orders orders : ordersList) {
            OrdersVo  ordersVo = new OrdersVo();
            BeanUtils.copyProperties(orders, ordersVo);
            ordersVoList.add(ordersVo);
        }
        return ordersVoList;
    }

    @Override
    public int updateOrders(Orders orders) {
        return ordersMapper.update(orders);
    }
}
