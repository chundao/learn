/**
 * Project: springclient
 * 
 * File Created at 2013-5-27����3:21:00
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
 * 2013-5-27����3:21:00
 */
public class RemotingTest {
    
    private static void testRMI(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) context.getBean("productService");
        
        List<Product> allProducts = productService.getAllProducts();
        if( allProducts != null ){
            for( Product product : allProducts ){
                System.out.println( product.getName() + "," + product.getPrice() );
            }
        }
    }
    
    private static void testHessian(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) context.getBean("hessionProductService");
        
        List<Product> allProducts = productService.getAllProducts();
        if( allProducts != null ){
            for( Product product : allProducts ){
                System.out.println( product.getName() + "," + product.getPrice() );
            }
        }
    }
    
    private static void testBurlap(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) context.getBean("burlapProductService");
        
        List<Product> allProducts = productService.getAllProducts();
        if( allProducts != null ){
            for( Product product : allProducts ){
                System.out.println( product.getName() + "," + product.getPrice() );
            }
        }
    }
    
    private static void testHttpInvoker(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) context.getBean("burlapProductService");
        
        List<Product> allProducts = productService.getAllProducts();
        if( allProducts != null ){
            for( Product product : allProducts ){
                System.out.println( product.getName() + "," + product.getPrice() );
            }
        }
    }
    
    private static void testWebServices(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) context.getBean("webServicesProductService");
        
        List<Product> allProducts = productService.getAllProducts();
        if( allProducts != null ){
            for( Product product : allProducts ){
                System.out.println( product.getName() + "," + product.getPrice() );
            }
        }
    }
    
    
    public static void main(String[] args) {
        
//        testHessian();
//        testBurlap();
//        testHttpInvoker();
        testWebServices();
        
    }
    
    
    
    

}
