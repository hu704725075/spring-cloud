package com.cloud.feign.service;

import com.cloud.feign.rpc.GetHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by HYP on 2018/10/18.
 */
@Service
public class HelloService {
    private static final String TAG = "HelloService";
    @Autowired
    private GetHello getHello;

    public String sayHello(){
        return getHello.sayHello();
    }
}  