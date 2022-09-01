package com.lb.ssm.controller;


import com.lb.ssm.common.dto.OrdersDto;
import com.lb.ssm.common.vo.OrdersVo;
import com.lb.ssm.entity.Orders;
import com.lb.ssm.entity.User;
import com.lb.ssm.mapper.UserMapper;
import com.lb.ssm.service.OrdersService;
import com.lb.ssm.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @Autowired
    private UserService userService;

    // 通过用户名查询用户订单信息
    @GetMapping("/query")
    public List<OrdersVo> queryOrdersByName(@RequestParam String username) {
        List<OrdersVo> ordersVoList = ordersService.getOrders(userService.getUserIdByName(username));
        ordersVoList.forEach(item->item.setUsername(username));
        return ordersVoList;
    }

    // 添加用户订单信息
    @PostMapping("/add")
    public int addOrders(@RequestParam OrdersDto ordersDto){
       return ordersService.addOrder(ordersDto);
    }
}
