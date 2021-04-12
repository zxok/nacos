package com.feign.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: feign-producer
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2021-04-09 15:47
 *
 *  生产者
 **/
@RestController
@RequestMapping("/producer")
public class TestController {

    @Value("${server.port}")
    int port;

    @GetMapping("test")
    public String test() {
        return "feign-producer  "+port;
    }

    @GetMapping("testData")
    public String testData(String data) {
        return "feign-producer("+data+")  "+port;
    }
}
