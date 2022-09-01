package com.lb.ssm.mapper;

import com.lb.ssm.entity.User;
import org.apache.ibatis.annotations.Param;
import java.util.ArrayList;

public interface UserMapper {

    int insert(@Param("user") User user);
    User select(@Param("username") String username);
    int update(@Param("user") User user);
}
