package com.dubbo.producer.controller;

import com.dubbo.producer.service.IDubboProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: nacos
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2021-04-12 10:16
 **/
@RestController
public class TestController {

    @Resource
    IDubboProducerService dubboProducerService;

    @GetMapping("test")
    public String test() {
        return dubboProducerService.producerTest();
    }
}
