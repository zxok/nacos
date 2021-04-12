package com.dubbo.producer.service.impl;

import com.dubbo.producer.service.IDubboProducerService;
import org.apache.dubbo.config.annotation.Service;
//import org.springframework.stereotype.Service;

/**
 * @program: nacos
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2021-04-12 10:12
 **/
@Service
public class DubboProducerServiceImpl implements IDubboProducerService {
    @Override
    public String producerTest() {
        return "dubbo-producer";
    }
}
