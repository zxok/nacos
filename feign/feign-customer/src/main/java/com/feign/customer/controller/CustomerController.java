package com.feign.customer.controller;

import com.feign.customer.feign.FeignProducerService;
import com.feign.customer.feign.NacosTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: feign-customer
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2021-04-12 14:21
 **/
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    FeignProducerService feignProducerService;

    @GetMapping("test")
    public String test() {
        return "feign-customer";
    }

    @GetMapping("testFeign")
    public String testFeign() {
        String test = feignProducerService.test();
        return "feign-customer  >>>  \n" + test;
    }

    @GetMapping("testFeignData")
    public String testFeignData(String data) {
        String test = feignProducerService.testData(data);
        return "feign-customer  >>>  \n" + test;
    }

}
