/**
 * Project: cxf
 * 
 * File Created at 2013-7-6下午3:37:37
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
package com.chundao.learn.cxf.client;

import java.awt.print.Book;
import java.util.List;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;

import com.chundao.learn.cxf.entity.Product;
import com.chundao.learn.cxf.service.interfaces.ProductService;


/**
 * 类 ProxyApp 的实现描述：TODO 类实现描述
 * @author zhen.wz
 * 2013-7-6下午3:37:37
 */
public class ProxyApp {
    
    private static void test1(){
        ProductService productService = JAXRSClientFactory.create("http://localhost/cxf/", ProductService.class);

        Product product = productService.getProductById(1);
        System.out.println( product );
        
        System.out.println( "=========================华丽的分割线========================" );
        
        List<Product> allProducts = productService.getAllProducts();
        System.out.println( allProducts );
    }
    
    public static void main(String[] args) {
        test1();
    }

}
