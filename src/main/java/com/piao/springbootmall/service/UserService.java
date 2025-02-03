package com.piao.springbootmall.service;

import com.piao.springbootmall.dto.UserRegisterRequest;
import com.piao.springbootmall.model.User;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);
    User getUserById(Integer userId);
}
