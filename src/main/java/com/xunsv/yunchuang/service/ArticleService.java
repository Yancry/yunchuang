package com.xunsv.yunchuang.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author Yancary
 * @Description //TODO
 * @Date 2018/12/28 10:30
 */
public interface ArticleService {
    /**
     * 新增文章
     *
     * @param jsonObject
     * @return
     */
    JSONObject addArticle(JSONObject jsonObject);

    /**
     * 文章列表
     *
     * @param jsonObject
     * @return
     */
    JSONObject listArticle(JSONObject jsonObject);

    /**
     * 更新文章
     *
     * @param jsonObject
     * @return
     */
    JSONObject updateArticle(JSONObject jsonObject);
}
