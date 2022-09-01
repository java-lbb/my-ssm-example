package com.lb.ssm.controller;

import com.lb.ssm.common.dto.UserDetailDto;
import com.lb.ssm.common.qo.UserDetailAndOrdersQo;
import com.lb.ssm.common.vo.UserDetailAndOrdersVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-service.xml","classpath:spring-mapper.xml"})
public class UserControllerTest {

    @Autowired
    private UserController userController;

    @Test
    public void requireUserDetailAndOrders() {

    }

    @Test
    public void addUserAndDetail() {

    }

    @Test
    public void requireUserAndDetail() {
    }
}