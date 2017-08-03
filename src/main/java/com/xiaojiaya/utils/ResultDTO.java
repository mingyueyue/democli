package com.xiaojiaya.utils;

/**
 * Created by moon on 2017/7/6.
 * 返回对象类
 */
public class ResultDTO {
    private int code;//返回码
    private String description;//返回描述
    private Object values;//返回值

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getValues() {
        return values;
    }

    public void setValues(Object values) {
        this.values = values;
    }

    public ResultDTO() {
    }

    public ResultDTO(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public ResultDTO(int code, String description, Object values) {


        this.code = code;
        this.description = description;
        this.values = values;
    }
}
