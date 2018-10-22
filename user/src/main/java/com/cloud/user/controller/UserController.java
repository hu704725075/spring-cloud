package com.cloud.user.controller;

import com.cloud.user.pojo.User;
import com.cloud.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HYP on 2018/10/18.
 */

@RestController
public class UserController {
    private static final String TAG = "UserController";

    @Autowired
    private IUserService userService;

    @GetMapping("/test")
    public String test(){
        return "success";
    }
    @GetMapping("/user")
    public User queryUserById(Integer userId){
        return userService.queryUserById(userId);
    }
}