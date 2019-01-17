package com.xunsv.yunchuang.config.shiro;

import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * @Author Yancary
 * @Description Shiro密码生成类加盐
 * @Date 2019/1/4 10:34
 */
public class ShiroMd5Util {

    //添加user的密码加密方法
    public static String SysMd5(JSONObject jsonObject) {
        String hashAlgorithmName = "MD5";//加密方式

        Object crdentials = jsonObject.getString("password");//密码原值

        ByteSource salt = ByteSource.Util.bytes(jsonObject.getString("username"));//以账号作为盐值

        int hashIterations = 1024;//加密1024次【和Shiro配置的加密次数一致】

        SimpleHash hash = new SimpleHash(hashAlgorithmName, crdentials, salt, hashIterations);

        return hash.toString();
    }
}
