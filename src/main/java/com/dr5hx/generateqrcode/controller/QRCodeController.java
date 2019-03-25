package com.dr5hx.generateqrcode.controller;

import com.dr5hx.generateqrcode.entity.User;
import com.dr5hx.generateqrcode.response.Response;
import com.dr5hx.generateqrcode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.sql.Timestamp;
import java.util.Date;

@RestController
public class QRCodeController {
    @Autowired
    private UserService userService;

    @GetMapping("/password")
    public Response generateQRCodeForWiFiPassword() {
        return Response.FAILURE();
    }

    @GetMapping("/test/user")
    public Response addUser() {
        User user = getUser();
        Integer insert = userService.insert(user);
        return Response.SUCCESS(insert);

    }

    private User getUser() {
        User user = new User();
        user.setId(100L);
        Timestamp registerTime = new Timestamp(new Date().getTime());
        user.setRegisterTime(registerTime);
        user.setUpdateTime(registerTime);
        user.setUserName("dr5hx");
        user.setUserPassword("123456");
        user.setUserSalt("2015");
        return user;
    }

//    @GetMapping("/test/user01")
//    public Response addUser01() {
//        User user = getUser();
//        Integer insert = userService01.insert(user);
//        return Response.SUCCESS(insert);
//
//    }

}
