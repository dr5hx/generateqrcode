package com.dr5hx.generateqrcode.service.impl;

import com.dr5hx.generateqrcode.entity.User;
import com.dr5hx.generateqrcode.exception.UserException;
import com.dr5hx.generateqrcode.repository.UserMapper;
import com.dr5hx.generateqrcode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean addUser(List<User> userList) throws UserException {

        int i = 0;
        for (User user : userList) {
            userMapper.insert(user);
            i++;
        }
        if (userList.size() == i) {
            return true;
        } else {
            throw new UserException();
        }

    }
}
