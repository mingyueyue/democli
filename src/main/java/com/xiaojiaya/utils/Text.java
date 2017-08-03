package com.xiaojiaya.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by moon on 2017/8/1.
 * 工具类
 */
public class Text {
    public static boolean isNullOREmpty(String str) {
        return (str == null || "".equals(str)) ? true : false;
    }

    public static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String getFormatDate() {
        return df.format(new Date());
    }
}
