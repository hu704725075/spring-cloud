package com.cloud.user.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by HYP on 2018/10/18.
 */
@FeignClient(value="ribbon-consumer")
@Repository
public interface GetActivityList {
    @RequestMapping(value="/hello?name=feign",method = RequestMethod.GET)
    public String sayHello();
}
