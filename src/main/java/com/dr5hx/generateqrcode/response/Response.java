package com.dr5hx.generateqrcode.response;

public class Response {
    //回传code 1 成功 0 请求出错 -1 接口报错
    private Integer code;
    //回传数据
    private Object data;
    //传送信息
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static Response SUCCESS(Object data) {
        Response response = new Response();
        response.setCode(1);
        response.setMsg("请求成功");
        response.setData(data);
        return response;
    }

    public static Response SUCCESS(Object data, String msg) {
        Response response = new Response();
        response.setCode(1);
        response.setMsg(msg);
        response.setData(data);
        return response;
    }

    public static Response SUCCESS(String msg) {
        Response response = new Response();
        response.setCode(1);
        response.setMsg(msg);
        return response;
    }

    public static Response FAILURE() {
        Response response = new Response();
        response.setCode(0);
        response.setMsg("请求失败");
        return response;
    }

    public static Response FAILURE(String msg) {
        Response response = new Response();
        response.setCode(0);
        response.setMsg(msg);
        return response;
    }

    public static Response ERROR() {
        Response response = new Response();
        response.setCode(-1);
        response.setMsg("接口存在问题");
        return response;
    }

    public static Response ERROR(String msg) {
        Response response = new Response();
        response.setCode(-1);
        response.setMsg(msg);
        return response;
    }
}
