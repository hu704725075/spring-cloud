package com.cloud.ribbon.controller;

import com.cloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;

/**
 * Created by HYP on 2018/10/18.
 */
@RestController()
public class HelloController {
    private static final String TAG = "HelloController";
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String sayHello(String name){
        return helloService.sayHello() +"___>" +name;
    }
}  