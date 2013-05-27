/**
 * Project: springclient
 * 
 * File Created at 2013-5-27ÏÂÎç3:21:00
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
package com.chundao.learn.springclient.rmi;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chundao.crow.core.entity.Product;
import com.chundao.crow.core.service.ProductService;

/**
 * @author zhen.wz
 * 2013-5-27ÏÂÎç3:21:00
 */
public class RMITest {
    
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) context.getBean("productService");
        
        List<Product> allProducts = productService.getAllProducts();
        if( allProducts != null ){
            for( Product product : allProducts ){
                System.out.println( product.getName() + "," + product.getPrice() );
            }
        }
        
    }
    
    
    

}
