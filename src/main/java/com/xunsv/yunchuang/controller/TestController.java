package com.xunsv.yunchuang.controller;

import com.alibaba.fastjson.JSONObject;
import com.xunsv.yunchuang.dao.TestDao;
import com.xunsv.yunchuang.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Author Yancary
 * @Description //TODO
 * @Date $ $
 * @Param $
 * @return $
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestDao testDao;

    @GetMapping("/user")
    public JSONObject userByJg(String orgCode) {
        return CommonUtil.successJson(testDao.userById(orgCode));
    }
}
