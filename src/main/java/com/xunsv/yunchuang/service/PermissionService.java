package com.xunsv.yunchuang.service;

import com.alibaba.fastjson.JSONObject;


/**
 * @Author Yancary
 * @Description //TODO
 * @Date 2018/12/28 10:30
 */
public interface PermissionService {
    /**
     * 查询某用户的 角色  菜单列表   权限列表
     *
     * @param username
     * @return
     */
    JSONObject getUserPermission(String username);
}
