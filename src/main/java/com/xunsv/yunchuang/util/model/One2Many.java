package com.xunsv.yunchuang.util.model;

import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Set;


/**
 * @Author Yancary
 * @Description 处理权限Json
 * @Date 2018/12/28 10:30
 */
public class One2Many extends JSONObject {
    private Set<String> roleList;
    private Set<String> menuList;
    private Set<String> permissionList;
    private Set<Integer> permissionIds;
    private List<JSONObject> picList;
    private List<JSONObject> menus;
    private List<JSONObject> users;
    private List<JSONObject> permissions;
}
