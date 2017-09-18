package com.zgiot.common.restcontroller;

import com.zgiot.common.exceptions.SysException;

public class ServerResponse<T> {
    private String message;
    private Integer code;
    private T data;

    public ServerResponse(String message, Integer errorCode, T data) {
        this.message = message;
        this.code = errorCode;
        this.data = data;
    }

    public static ServerResponse buildFromException(SysException e) {
        return new ServerResponse(
                e.getMessage(), e.getErrorCode(), e.getData()
        );
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ServerResponse{" +
                "message='" + message + '\'' +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
