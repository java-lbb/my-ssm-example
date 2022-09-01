package com.lb.ssm.mapper;

import com.lb.ssm.entity.User;
import com.lb.ssm.entity.UserDetail;
import org.apache.ibatis.annotations.Param;

public interface UserDetailMapper {
    int insert(@Param("userDetail") UserDetail userDetail);
    UserDetail select(@Param("userId") Integer userId);
    int update(@Param("userDetail") UserDetail userDetail);
}
