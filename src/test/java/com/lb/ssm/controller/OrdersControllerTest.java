package com.lb.ssm.controller;

import com.lb.ssm.common.dto.OrdersDto;
import com.lb.ssm.common.vo.OrdersVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-service.xml","classpath:spring-mapper.xml"})
public class OrdersControllerTest {

    @Autowired
    private OrdersController ordersController;
    @Test
    public void queryOrdersByName() {
        List<OrdersVo> ordersVoList = ordersController.queryOrdersByName("刘冰冰");
        System.out.println(ordersVoList);
    }

    @Test
    public void addOrders() {
        OrdersDto ordersDto = new OrdersDto();
        ordersDto.setUsername("蔡徐坤");
        ordersDto.setDetail("篮球");
        ordersDto.setNumber(10005);
        int i = ordersController.addOrders(ordersDto);
        System.out.println(i);
    }
}