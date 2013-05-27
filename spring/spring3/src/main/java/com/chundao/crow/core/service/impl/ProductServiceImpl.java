/**
 * Project: springmvc
 * 
 * File Created at 2013-5-25上午11:42:37
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
package com.chundao.crow.core.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.chundao.crow.core.entity.Product;
import com.chundao.crow.core.service.ProductService;


/**
 * @author zhen.wz
 * 2013-5-25上午11:42:37
 */
public class ProductServiceImpl implements ProductService {
    
    /** 储存，临时替代数据库 */
    private final static Map<Integer,Product> map = new HashMap<Integer,Product>();
    // 数据准备
    static{
        Product p1 = new Product(1, "pen", "a pen hehe", 2.5 , 100);
        Product p2 = new Product(2, "Thinking in Java", "a book describe java", 50 , 40);
        Product p3 = new Product(3, "Spring in Action", "a book describe spring 3", 35 , 50);
        Product p4 = new Product(4, "Apache tomcat 7", "a book describe tomcat 7", 30 , 100);
        
        map.put(p1.getId(), p1);
        map.put(p2.getId(), p2);
        map.put(p3.getId(), p3);
        map.put(p4.getId(), p4);
    }

    /**
     * @author zhen.wz
     * 2013-5-25上午11:42:37
     */
    @Override
    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<Product>();
        Set<Entry<Integer, Product>> entrySet = map.entrySet();
        for( Entry<Integer, Product> entry : entrySet ){
            list.add(entry.getValue());
        }
        return list;
    }

    /**
     * @author zhen.wz
     * 2013-5-25上午11:42:37
     */
    @Override
    public Product getProductById(Integer id) {
        return map.get(id);
    }

}
