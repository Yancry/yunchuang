package com.xunsv.yunchuang.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @Author Yancary
 * @Description 文章Dao层
 * @Date 2018/12/28 10:27
 */
public interface ArticleDao {
    /**
     * 新增文章
     *
     * @param jsonObject
     * @return
     */
    int addArticle(JSONObject jsonObject);

    /**
     * 统计文章总数
     *
     * @param jsonObject
     * @return
     */
    int countArticle(JSONObject jsonObject);

    /**
     * 文章列表
     *
     * @param jsonObject
     * @return
     */
    List<JSONObject> listArticle(JSONObject jsonObject);

    /**
     * 更新文章
     *
     * @param jsonObject
     * @return
     */
    int updateArticle(JSONObject jsonObject);
}
