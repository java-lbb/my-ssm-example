package com.lb.ssm.service.impl;

import com.lb.ssm.common.dto.UserDetailDto;
import com.lb.ssm.common.exception.ServiceException;
import com.lb.ssm.common.qo.UserDetailAndOrdersQo;
import com.lb.ssm.common.vo.OrdersVo;
import com.lb.ssm.common.vo.UserDetailAndOrdersVo;
import com.lb.ssm.common.vo.UserDetailVo;
import com.lb.ssm.entity.Orders;
import com.lb.ssm.entity.User;
import com.lb.ssm.entity.UserDetail;
import com.lb.ssm.mapper.OrdersMapper;
import com.lb.ssm.mapper.UserDetailMapper;
import com.lb.ssm.mapper.UserMapper;
import com.lb.ssm.result.ResponseCode;
import com.lb.ssm.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserDetailMapper userDetailMapper;
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public int getUserIdByName(String username) {
        return userMapper.select(username).getUserId();
    }


    @Override
    @Transactional
    public int addUserAndDetail(UserDetailDto userDto) {
        User user = new User();
        UserDetail userDetail = new UserDetail();
        BeanUtils.copyProperties(userDto, user);
        BeanUtils.copyProperties(userDto, userDetail);
        try {
            userMapper.insert(user);
            userDetail.setUserId(user.getUserId());
            return userDetailMapper.insert(userDetail);
        } catch (Exception e) {
            throw new ServiceException(ResponseCode.ADD_USER_AND_DETAIL_ERROR);
        }
    }

    @Override
    public UserDetailVo getUserAndDetail(String username) {
        User user = userMapper.select(username);
        UserDetail userDetail = userDetailMapper.select(user.getUserId());
        UserDetailVo userDetailVo = new UserDetailVo();
        BeanUtils.copyProperties(userDetail, userDetailVo);
        userDetailVo.setUsername(username);
        return userDetailVo;
    }

    @Override
    public UserDetailAndOrdersVo getUserDetailAndOrders(UserDetailAndOrdersQo userDetailAndOrdersQo) {
        UserDetailAndOrdersVo userDetailAndOrdersVo = new UserDetailAndOrdersVo();
        try {
            User user = userMapper.select(userDetailAndOrdersQo.getUsername());
            UserDetail userDetail = userDetailMapper.select(user.getUserId());
            BeanUtils.copyProperties(userDetail, userDetailAndOrdersVo);
            List<OrdersVo> ordersVoList = new ArrayList<>();
            List<Orders> ordersList = ordersMapper.select(user.getUserId());
            for (Orders orders : ordersList) {
                OrdersVo ordersVo = new OrdersVo();
                ordersVo.setUsername(userDetailAndOrdersQo.getUsername());
                BeanUtils.copyProperties(orders, ordersVo);
                ordersVoList.add(ordersVo);
            }
            userDetailAndOrdersVo.setUsername(userDetailAndOrdersQo.getUsername());
            userDetailAndOrdersVo.setOrdersVoList(ordersVoList);
        }catch (Exception ex){
            throw new ServiceException(ResponseCode.QUERY_USERINFO_ERROR);
        }
        return userDetailAndOrdersVo;
    }
}
