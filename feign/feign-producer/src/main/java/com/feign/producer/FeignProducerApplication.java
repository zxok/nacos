package com.feign.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: feign-producer
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2021-04-12 14:03
 **/
@SpringBootApplication
//开启注册中心
@EnableDiscoveryClient
public class FeignProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignProducerApplication.class,args);
    }

}
