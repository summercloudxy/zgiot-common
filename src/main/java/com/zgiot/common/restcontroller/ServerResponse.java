package com.zgiot.common.restcontroller;

import com.zgiot.common.exceptions.SysException;

public class ServerResponse<T> {
    private String message;
    private Integer errorCode;
    private T data;

    public ServerResponse(String message, Integer errorCode, T data) {
        this.message = message;
        this.errorCode = errorCode;
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

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
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
                ", errorCode=" + errorCode +
                ", data=" + data +
                '}';
    }
}
