package com.feign.customer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Hzx
 *
 *  消费者
 */
@FeignClient(value = "feign-producer",path = "/producer")
public interface FeignProducerService {

    @GetMapping("test")
    String test();

    @GetMapping("testData")
    String testData(@RequestParam("data") String data);

}
