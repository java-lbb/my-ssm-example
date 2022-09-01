package com.lb.ssm.controller;

import com.lb.ssm.common.dto.UserDetailDto;
import com.lb.ssm.common.qo.UserDetailAndOrdersQo;
import com.lb.ssm.common.vo.UserDetailAndOrdersVo;
import com.lb.ssm.result.ResponseCode;
import com.lb.ssm.result.ResponseResult;
import com.lb.ssm.service.UserService;
import com.lb.ssm.common.vo.UserDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    // 添加用户基本信息与详情
    @PostMapping("/add")
    public ResponseResult<Integer> addUserAndDetail(@RequestBody UserDetailDto userDto) {
        return ResponseResult.success(ResponseCode.ADD_USERINFO_SUCCESS,userService.addUserAndDetail(userDto));
    }

    //通过用户名查询用户详情信息
    @GetMapping("/query/detail")
    public UserDetailVo requireUserAndDetail(@RequestParam String username ){
        return userService.getUserAndDetail(username);
    }


    //通过用户名和密码查询用户详情信息及其所有订单
    @PostMapping("/query/detail/orders")
    public ResponseResult<UserDetailAndOrdersVo> requireUserDetailAndOrders(@RequestBody UserDetailAndOrdersQo userDetailAndOrdersQo){
        return  ResponseResult.success(ResponseCode.SUCCESS,userService.getUserDetailAndOrders(userDetailAndOrdersQo));
    }
}
