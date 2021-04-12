package com.dubbo.customer.controller;

import com.dubbo.customer.service.IDubboCustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: nacos
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2021-04-12 10:16
 *
 *  消费者
 **/
@RestController
public class TestController {

    @Resource
    IDubboCustomerService dubboCustomerService;

    @GetMapping("test")
    public String test() {
        return dubboCustomerService.customerTest();
    }

    @GetMapping("dubboTest")
    public String dubboTest() {
        return dubboCustomerService.dubboTest();
    }
}
