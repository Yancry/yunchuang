package com.xunsv.yunchuang.util;


/**
 * @Author Yancary
 * @Description //TODO
 * @Date 2018/12/28 10:31
 */
public class StringTools {

    public static boolean isNullOrEmpty(String str) {
        return null == str || "".equals(str) || "null".equals(str);
    }

    public static boolean isNullOrEmpty(Object obj) {
        return null == obj || "".equals(obj);
    }
}
