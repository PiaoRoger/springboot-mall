package com.piao.springbootmall.dao;

import com.piao.springbootmall.dto.UserRegisterRequest;
import com.piao.springbootmall.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);
    User getUserById(Integer userId);
}
