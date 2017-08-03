package com.xiaojiaya.utils;

/**
 * Created by moon on 2017/8/2.
 * 这个是定义返回码的
 */
public class Code {
    //成功 200 表示访问成功，没有错误，
    public static int SUCCESS = 200;
    //问题系列
    //参数有问题
    public static int ERROR_PARAM = 300;
    //token有问题
    public static int ERROR_TOKEN = 301;
    //用户没有操作权限
    public static int ERROR_AUTH = 302;
    //登录时，用户名和密码有问题
    public static int ERROR_LOGIN = 303;
    //
    //错误系列
    //要添加的值已存在
    public static int ERROR_IS_EXIST = 401;
    //要修改或删除的值不存在
    public static int ERROR_NOT_EXIST = 402;
    //未知的错误
    public static int ERROR_INTERVAL = 404;

}
