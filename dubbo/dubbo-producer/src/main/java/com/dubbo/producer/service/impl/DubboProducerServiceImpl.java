package com.dubbo.producer.service.impl;

import com.dubbo.producer.service.IDubboProducerService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
//import org.springframework.stereotype.Service;

/**
 * @program: nacos
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2021-04-12 10:12
 **/
@Service
public class DubboProducerServiceImpl implements IDubboProducerService {

    @Value("${server.port}")
    int port;

    @Override
    public String producerTest() {
        return "dubbo-producer";
    }

    @Override
    public String ribbonTest() {
        return "dubbo-producer  "+port;
    }

    /**
     * 获取当前服务器域名、IP、端口
     */
    public String serviceInfo() throws UnknownHostException {
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        //获取服务器域名
        String serverName = request.getServerName();
        //获取服务器端口
        int port = request.getServerPort();
        //获取服务器IP地址
        InetAddress address= InetAddress.getByName(request.getServerName());
        String ip = address.getHostAddress();

        return ip+":"+port;
    }
}
