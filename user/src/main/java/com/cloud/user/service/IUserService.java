package com.cloud.user.service;

import com.cloud.user.pojo.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IUserService {
    List<User> findAllUser();

    int addUser(User user);

    int deleteUser(Integer userId);

    User queryUserById(Integer userId);

    PageInfo<User> listUser(Integer pageNo, Integer pageSize);

    Integer updateUser(User user);
}