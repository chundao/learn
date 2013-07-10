/**
 * Project: cxf
 * 
 * File Created at 2013-7-6下午12:28:46
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
package com.chundao.learn.cxf.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.chundao.learn.cxf.entity.Product;
import com.chundao.learn.cxf.service.interfaces.ProductService;


/**
 * @author zhen.wz
 * 2013-7-6下午12:28:46
 */
public class ProductServiceImpl implements ProductService {

    private int size = 100;
    
    private final static Map<Integer,Product> map = new HashMap<Integer,Product>();
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
     */
    @Override
    public Product getProductById( Integer id) {
        return map.get(id);
    }

    /**
     * @author zhen.wz
     * @throws ProductRepeatException 
     */
    @Override
    public Product addProduct(Product product) {
        if( product == null ){
            return null;
        }
        
        if( map.containsKey(product.getId()) ){
            return null;
        }else{
            map.put(product.getId(), product);
            return product;
        }
    }

    /**
     * @author zhen.wz
     * 2013-6-23上午9:58:48
     */
    @Override
    public Product update(Product product) {
        if( product != null && product.getId() > 0 ){
            return map.put(product.getId(), product);
        }
        return null;
    }
    
    /**
     * @author zhen.wz
     * 2013-6-23上午10:03:12
     */
    @Override
    public Product delete( Integer id) {
        return map.remove(id);
    }
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public static Map<Integer, Product> getMap() {
        return map;
    }

    /**
     * @author zhen.wz
     * 2013-7-6下午1:02:31
     */
    @Override
    public String say(String name) {
        return "hello," + name ;
    }
    
}
