package com.xunsv.yunchuang.dao;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Yancary
 * @Description 登录相关dao
 * @Date 2018/12/28 10:28
 */
public interface LoginDao {
    /**
     * 根据用户名和密码查询对应的用户
     *
     * @param username 用户名
     * @param password 密码
     * @return
     */
    JSONObject getUser(@Param("username") String username);
}
