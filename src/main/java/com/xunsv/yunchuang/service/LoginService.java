package com.xunsv.yunchuang.service;

import com.alibaba.fastjson.JSONObject;


/**
 * @Author Yancary
 * @Description 登录Service
 * @Date 2018/12/28 10:30
 */
public interface LoginService {
    /**
     * 登录表单提交
     *
     * @param jsonObject
     * @return
     */
    JSONObject authLogin(JSONObject jsonObject);

    /**
     * 根据用户名和密码查询对应的用户
     *
     * @param username 用户名
     * @return
     */
    JSONObject getUser(String username);

    /**
     * 查询当前登录用户的权限等信息
     *
     * @return
     */
    JSONObject getInfo();

    /**
     * 退出登录
     *
     * @return
     */
    JSONObject logout();
}
