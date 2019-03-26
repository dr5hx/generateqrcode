package com.dr5hx.generateqrcode.controller;

import com.dr5hx.generateqrcode.entity.User;
import com.dr5hx.generateqrcode.response.Response;
import com.dr5hx.generateqrcode.service.UserService;
import com.dr5hx.generateqrcode.util.NullCheckTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class QRCodeController {
    @Autowired
    private UserService userService;

    @GetMapping("/password")
    public Response generateQRCodeForWiFiPassword() {
        return Response.FAILURE();
    }


    @GetMapping("/test/user")
    public Response addUser(String userList) {
        boolean flag = NullCheckTools.checkObjectIsNotNull(userList);
        if (!flag) {
            return Response.FAILURE("请求参数不可为空");
        }
        List<User> users = new ArrayList<>();
        User user = new User();
        Date registerTime = new Date();
        user.setRegisterTime(registerTime);
        user.setUpdateTime(registerTime);
        user.setUserPassword("123");
        user.setUserSalt("123");
        user.setUserName("dr5hx");
        users.add(user);
        boolean b = userService.addUser(users);
        if (b) {
            return Response.SUCCESS("添加成功");
        } else {
            return Response.FAILURE("添加失败");

        }

    }


}
