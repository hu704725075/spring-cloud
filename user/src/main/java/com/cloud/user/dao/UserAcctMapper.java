package com.cloud.user.dao;

import com.cloud.user.pojo.UserAcct;

public interface UserAcctMapper {
    /**
     *
     * @mbggenerated 2018-10-22
     */
    int deleteByPrimaryKey(Integer userAcctId);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    int insert(UserAcct record);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    int insertSelective(UserAcct record);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    UserAcct selectByPrimaryKey(Integer userAcctId);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    int updateByPrimaryKeySelective(UserAcct record);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    int updateByPrimaryKey(UserAcct record);
}