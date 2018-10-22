package com.cloud.user.service.impl;

import com.cloud.user.dao.UserMapper;
import com.cloud.user.pojo.User;
import com.cloud.user.rpc.GetActivityList;
import com.cloud.user.service.IUserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HYP on 2018/10/17.
 */
@Service(value="userService")
public class UserServiceImpl implements IUserService {
    private static final String TAG = "UserServiceImpl";

    @Autowired
    private UserMapper userDao;

    @Autowired
    private GetActivityList getActivityList;

    @Override
    public List<User> findAllUser() {
        return userDao.selectAll();
    }

    @Override
    public int addUser(User user) {
        return userDao.insert(user);
    }

    @Override
    public int deleteUser(Integer userId) {
        return userDao.deleteByPrimaryKey(userId);
    }

    @Override
    public User queryUserById(Integer userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public PageInfo<User> listUser(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        Page page = (Page) userDao.selectAll();
        PageInfo<User> pageInfo = new PageInfo<>(page);
        return pageInfo;
    }

    @Override
    public Integer updateUser(User user) {
        return userDao.updateByPrimaryKey(user);
    }
}