package com.dr5hx.generateqrcode.controller;

import com.dr5hx.generateqrcode.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QRCodeController {
    @GetMapping("/password")
    public Response generateQRCodeForWiFiPassword() {
        return Response.ERROR();
    }

}
