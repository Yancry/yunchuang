package com.xunsv.yunchuang.dao;

import com.xunsv.yunchuang.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TestDao {


    @Select("SELECT * FROM sys_user WHERE org_code=#{orgCode}")
    List<User> userById(@Param("orgCode") String orgCode);
}
