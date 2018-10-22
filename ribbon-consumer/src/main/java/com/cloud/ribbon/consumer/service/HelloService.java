package com.cloud.ribbon.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by HYP on 2018/10/18.
 */
@Service
public class HelloService {
    private static final String TAG = "HelloService";

    @Autowired
    RestTemplate restTemplate;

    public String sayHello(){
        return restTemplate.getForObject("http://ribbon-provider/hello?name=ohuo",String.class);
    }
}  