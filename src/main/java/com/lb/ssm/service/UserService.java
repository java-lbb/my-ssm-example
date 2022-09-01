package com.lb.ssm.service;

import com.lb.ssm.common.dto.UserDetailDto;
import com.lb.ssm.common.qo.UserDetailAndOrdersQo;
import com.lb.ssm.common.vo.UserDetailAndOrdersVo;
import com.lb.ssm.common.vo.UserDetailVo;
import com.lb.ssm.entity.User;

public interface UserService {

    int getUserIdByName(String username);

    int addUserAndDetail(UserDetailDto userDto);

    UserDetailVo getUserAndDetail(String username);

    UserDetailAndOrdersVo getUserDetailAndOrders(UserDetailAndOrdersQo userDetailAndOrdersQo);
}
