package com.hzx.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: nacos
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2020-12-01 16:15
 **/
@SpringBootApplication
//开启注册中心
@EnableDiscoveryClient
public class NacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosApplication.class,args);
    }

}
