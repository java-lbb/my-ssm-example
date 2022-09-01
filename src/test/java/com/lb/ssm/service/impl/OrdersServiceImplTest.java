package com.lb.ssm.service.impl;

import com.lb.ssm.common.vo.OrdersVo;
import com.lb.ssm.service.OrdersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-service.xml","classpath:spring-mapper.xml"})
public class OrdersServiceImplTest {

    @Autowired
    private OrdersService ordersService;

    @Test
    public void getOrders() {
        List<OrdersVo> ordersVoList = ordersService.getOrders(2);
        System.out.println(ordersVoList);
    }
}