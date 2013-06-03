/**
 * Project: simplecxf
 * 
 * File Created at 2013-6-3обнГ3:37:46
 * $Id$
 * 
 * Copyright 1999-2012 Alibaba.com Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.chundao.learn.simplecxf.getstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhen.wz
 * 2013-6-3обнГ3:37:46
 */
public class Test {
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/cxf/cxf-client.xml");
        HelloWorld helloClient = (HelloWorld)context.getBean("helloClient");
        System.out.println(helloClient.sayHi("cxf"));
    }
    
}
