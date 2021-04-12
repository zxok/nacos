package com.dubbo.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: nacos
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2021-04-12 10:21
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class DubboCustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboCustomerApplication.class,args);
    }
}
