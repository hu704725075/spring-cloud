package com.cloud.user.dao;

import com.cloud.user.pojo.Share;

public interface ShareMapper {
    /**
     *
     * @mbggenerated 2018-10-22
     */
    int deleteByPrimaryKey(Integer shareId);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    int insert(Share record);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    int insertSelective(Share record);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    Share selectByPrimaryKey(Integer shareId);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    int updateByPrimaryKeySelective(Share record);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    int updateByPrimaryKey(Share record);
}