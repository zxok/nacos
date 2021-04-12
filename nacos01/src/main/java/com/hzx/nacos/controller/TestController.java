package com.hzx.nacos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: nacos
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2021-04-09 15:47
 **/
@RestController
public class TestController {

    @GetMapping("test")
    public String test() {
        return "Nacos01";
    }
}
