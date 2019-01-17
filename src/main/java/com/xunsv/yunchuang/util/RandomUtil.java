package com.xunsv.yunchuang.util;

import java.util.UUID;


/**
 * @Author Yancary
 * @Description 生成随机码的工具类
 * @Date 2018/12/28 10:31
 */
public class RandomUtil {
    /**
     * 生成前缀+32位编码 用作id
     *
     * @return string
     */
    public static String genarateId(String prefix) {
        String uuid = prefix + UUID.randomUUID().toString().trim().replaceAll("-", "");
        return uuid;
    }
}
