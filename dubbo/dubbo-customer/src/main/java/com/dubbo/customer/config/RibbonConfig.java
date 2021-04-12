package com.dubbo.customer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: nacos
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2021-04-12 11:00
 *
 *  负载均衡配置
 **/
@Configuration
public class RibbonConfig {
    @Bean
    public IRule rule() {
        //轮询权重
        return new WeightedResponseTimeRule();
        //最少并发策略
        //return new BestAvailableRule();
    }
}
