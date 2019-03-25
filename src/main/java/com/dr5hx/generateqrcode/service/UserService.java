package com.dr5hx.generateqrcode.service;

import com.dr5hx.generateqrcode.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    Integer insert(User user) ;

}
