package com.dubbo.customer.service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Hzx
 */
public interface IDubboCustomerService {

    String customerTest();

    String dubboTest();

    String ribbonTest();

}
