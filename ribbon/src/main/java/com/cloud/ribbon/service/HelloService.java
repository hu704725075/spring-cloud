package com.cloud.ribbon.service;

import org.springframework.stereotype.Service;

/**
 * Created by HYP on 2018/10/18.
 */
@Service
public class HelloService {
    private static final String TAG = "HelloService";

    public String sayHello(){
        return "helloWorld"; // 提供一个hello World
    }
}  