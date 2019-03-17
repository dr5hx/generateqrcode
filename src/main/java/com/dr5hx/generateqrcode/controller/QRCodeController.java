package com.dr5hx.generateqrcode.controller;

import com.dr5hx.generateqrcode.dao.UserDao;
import com.dr5hx.generateqrcode.model.User;
import com.dr5hx.generateqrcode.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;

@RestController
public class QRCodeController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/password")
    public Response generateQRCodeForWiFiPassword() {
        return Response.FAILURE();
    }

    @GetMapping("/test/user")
    public Response addUser() {
        User user = new User();
        Timestamp registerTime = new Timestamp(new Date().getTime());
        user.setRegisterTime(registerTime);
        user.setUpdateTime(registerTime);
        user.setUserName("dr5hx");
        user.setUserPassword("123456");
        user.setUserSalt("2015");
        User save = userDao.save(user);
        return Response.SUCCESS(save);

    }

}
