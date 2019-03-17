package com.dr5hx.generateqrcode.exception;


import com.dr5hx.generateqrcode.response.Response;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice("com.dr5hx.generateqrcode.controller")
public class GlobalException {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Response handlerException() {
        return Response.ERROR();
    }

}
