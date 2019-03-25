package com.dr5hx.generateqrcode.service.impl;

import com.dr5hx.generateqrcode.entity.User;
import com.dr5hx.generateqrcode.repository.UserMapper;
import com.dr5hx.generateqrcode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public Integer insert(User user) {
        return userMapper.insert(user);
    }


}
