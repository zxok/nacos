package com.dubbo.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: nacos
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2021-04-12 10:09
 *
 *  生产者
 **/

@SpringBootApplication
@EnableDiscoveryClient
public class DubboProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboProducerApplication.class,args);
    }
}
