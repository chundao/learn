/**
 * Project: springmvc
 * 
 * File Created at 2013-5-25����11:32:55
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
package com.chundao.crow.core.entity;

<<<<<<< HEAD
=======
import java.io.Serializable;

>>>>>>> 20cf962c428e23dd472e0659c60e5da1c9e50a4a

/**
 * @author zhen.wz
 * 2013-5-25����11:32:55
 */
<<<<<<< HEAD
public class Product {
=======
public class Product implements Serializable {
    
    /**   **/
    private static final long serialVersionUID = 1660478225280761986L;
>>>>>>> 20cf962c428e23dd472e0659c60e5da1c9e50a4a
    
    private int id;
    private String name;
    private String description;
    private double price;
    private int stock;
    
    
<<<<<<< HEAD
=======
    
    /**
     * 
     */
    public Product() {
    }
    
>>>>>>> 20cf962c428e23dd472e0659c60e5da1c9e50a4a
    /**
     * @param id
     * @param name
     * @param description
     * @param stock
     */
    public Product(int id, String name, String description,double price, int stock) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
       this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getStock() {
        return stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}
