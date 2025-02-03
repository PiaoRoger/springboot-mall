package com.piao.springbootmall.service.impl;

import com.piao.springbootmall.dao.UserDao;
import com.piao.springbootmall.dto.UserRegisterRequest;
import com.piao.springbootmall.model.User;
import com.piao.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
