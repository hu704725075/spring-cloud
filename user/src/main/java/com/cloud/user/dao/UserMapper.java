package com.cloud.user.dao;

import com.cloud.user.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    /**
     *
     * @mbggenerated 2018-10-22
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    int insert(User record);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    int insertSelective(User record);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    User selectByPrimaryKey(Integer userId);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbggenerated 2018-10-22
     */
    int updateByPrimaryKey(User record);

    List<User> selectAll();
}