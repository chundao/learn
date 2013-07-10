/**
 * Project: cxf File Created at 2013-7-6ÏÂÎç12:26:56 $Id$ Copyright 1999-2012 Alibaba.com Corporation Limited. All rights
 * reserved. This software is the confidential and proprietary information of Alibaba Company.
 * ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package com.chundao.learn.cxf.entity;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 
 * @author zhen.wz 2013-7-6ÏÂÎç12:26:56
 */
@XmlRootElement(name="Product")  
public class Product {

    private int               id;
    private String            name;
    private String            description;
    private double            price;
    private int               stock;

    public Product() {
    }

    /**
     * @param id
     * @param name
     * @param description
     * @param stock
     */
    public Product(int id, String name, String description, double price, int stock) {
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

    /**
     * @author zhen.wz 2013-6-20ÏÂÎç10:18:42
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
