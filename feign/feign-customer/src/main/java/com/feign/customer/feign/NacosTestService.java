package com.feign.customer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "nacos-1")
public interface NacosTestService {

    @GetMapping("test")
    String test();

}
