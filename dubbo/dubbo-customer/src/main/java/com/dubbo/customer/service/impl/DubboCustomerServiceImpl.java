package com.dubbo.customer.service.impl;

import com.dubbo.customer.service.IDubboCustomerService;
import com.dubbo.producer.service.IDubboProducerService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @program: nacos
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2021-04-12 10:12
 **/
@Service
public class DubboCustomerServiceImpl implements IDubboCustomerService {

    @Reference
    IDubboProducerService dubboProducerService;

    @Override
    public String customerTest() {
        return "dubbo-customer";
    }

    @Override
    public String dubboTest() {
        return "dubbo-customer  >>>  "+dubboProducerService.producerTest();
    }


}
