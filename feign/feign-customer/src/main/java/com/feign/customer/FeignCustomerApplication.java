package com.feign.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: nacos
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2020-12-01 16:15
 **/
@SpringBootApplication(scanBasePackages = "com.feign.customer")
//开启注册中心
@EnableDiscoveryClient
//Feign注释（只有消费者需要）
@EnableFeignClients
public class FeignCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignCustomerApplication.class,args);
    }

}
