package com.xunsv.yunchuang.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.Set;

/**
 * @Author Yancary
 * @Description //TODO
 * @Date 2018/12/28 10:28
 */
public interface PermissionDao {
    /**
     * 查询用户的角色 菜单 权限
     *
     * @param username
     * @return
     */
    JSONObject getUserPermission(String username);

    /**
     * 查询所有的菜单
     *
     * @return
     */
    Set<String> getAllMenu();

    /**
     * 查询所有的权限
     *
     * @return
     */
    Set<String> getAllPermission();
}
