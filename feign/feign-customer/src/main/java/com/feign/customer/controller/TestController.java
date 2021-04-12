package com.feign.customer.controller;

import com.feign.customer.feign.NacosTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: nacos
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2021-04-09 15:47
 **/
@RestController
public class TestController {

    @Autowired
    NacosTestService nacosTestService;

    @GetMapping("test")
    public String test() {
        return "feign-customer";
    }

    @GetMapping("testFeign")
    public String testFeign() {
        String test = nacosTestService.test();
        return "feign-customer  >>>  " + test;
    }

}
