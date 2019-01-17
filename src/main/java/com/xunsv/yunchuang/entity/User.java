package com.xunsv.yunchuang.entity;

import com.xunsv.yunchuang.base.BaseEntity;
import lombok.Data;

import java.util.Date;

/*
 * @Author Yancary
 * @Description //TODO
 * @Date $ $
 * @Param $
 * @return $
 **/
@Data
public class User extends BaseEntity {
    private String username;
    private String password;
    private String nickname;
    private String roleId;
    private Date createTime;
    private Date updateTime;
    private Integer deleteStauts;
    private String orgCode;
}
