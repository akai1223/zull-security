package com.zek.zull.example.bean;

/**
 * description：
 *
 * @author zhangkai
 * @date 2020/12/30 16:31
 */
public enum ResponseCode {

    SUCCESS(10001, "成功"),
    ERROR(10002, "失败"),
    ROUTE_ERROR(10003, "请求路径不存在"),
    SERVER_ERROR(10004, "服务器响应异常"),
    TIMEOUT_ERROR(10005, "请求超时"),
    PARAMS_ERROR(10006, "参数错误"),
    SERVER_DOWNGRADE(10007, "服务降级");
    private int code;
    private String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
