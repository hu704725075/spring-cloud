package com.cloud.user.dao;

import com.cloud.user.pojo.Comment;

public interface CommentMapper {
    /**
     *
     * @mbggenerated 2018-10-22
     */
    int deleteByPrimaryKey(Integer commentId);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    int insert(Comment record);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    int insertSelective(Comment record);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    Comment selectByPrimaryKey(Integer commentId);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    int updateByPrimaryKey(Comment record);
}