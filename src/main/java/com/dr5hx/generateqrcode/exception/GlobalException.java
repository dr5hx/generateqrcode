package com.dr5hx.generateqrcode.exception;


import com.dr5hx.generateqrcode.response.Response;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 此处是全局的异常处理
 */
@ControllerAdvice("com.dr5hx.generateqrcode.controller")
public class GlobalException {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Response handlerException() {
        System.out.println("????????????/");
        return Response.ERROR();
    }

}
