package com.dr5hx.generateqrcode.service;

import com.dr5hx.generateqrcode.entity.User;
import com.dr5hx.generateqrcode.exception.UserException;

import java.util.List;

public interface UserService {
    boolean addUser(List<User> userList) throws UserException;
}
