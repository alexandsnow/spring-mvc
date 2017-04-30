package com.alex.realm.utils;

/**
 * Created by alex on 2017/5/1.
 * 系统返回对象类型，子类可以继承
 */

public class RealmBaseResponse<T> {

    private String code;
    private String message;
    private T response ;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "RealmBaseResponse{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", response=" + response +
                '}';
    }
}
