/**
 * Project: simplecxf File Created at 2013-6-3обнГ1:23:15 $Id$ Copyright 1999-2012 Alibaba.com Corporation Limited. All
 * rights reserved. This software is the confidential and proprietary information of Alibaba Company.
 * ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package com.chundao.learn.simplecxf.getstart;

import javax.jws.WebService;

/**
 * @author zhen.wz 2013-6-3
 * обнГ1:23:15
 */
@WebService(endpointInterface = "com.chundao.learn.simplecxf.getstart.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    /**
     * @author zhen.wz 2013-6-3
     * обнГ1:23:15
     */
    @Override
    public String sayHi(String text) {
        System.out.println("sayHi called");
        return "Hello " + text;
    }

}
