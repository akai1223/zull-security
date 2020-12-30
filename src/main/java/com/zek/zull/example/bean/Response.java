package com.zek.zull.example.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * description：
 *
 * @author zhangkai
 * @date 2020/12/30 16:30
 */
@Data
public class Response implements Serializable {
    //返回码
    private int code;
    //返回描述
    private String msg;
    //返回数据
    private Object data;

    public Response() {
    }

    //其他自定义
    public Response(ResponseCode tmResponseCode, Object data) {
        this.code = tmResponseCode.getCode();
        this.msg = tmResponseCode.getMsg();
        this.data = data;
    }

    //请求成功,不需要返回数据
    public Response ResponseSucess() {
        Response response = new Response();
        response.code = ResponseCode.SUCCESS.getCode();
        response.msg = ResponseCode.SUCCESS.getMsg();
        return response;
    }

    //请求失败,不需要返回数据
    public Response ResponseError() {
        Response response = new Response();
        response.code = ResponseCode.ERROR.getCode();
        response.msg = ResponseCode.ERROR.getMsg();
        return response;
    }

    //请求失败,需要返回数据
    public Response ResponseErrorData(Object data) {
        return new Response(ResponseCode.ERROR, data);
    }

    //请求成功,需要返回数据
    public Response ResponseSucessData(Object data) {
        return new Response(ResponseCode.SUCCESS, data);
    }
}
