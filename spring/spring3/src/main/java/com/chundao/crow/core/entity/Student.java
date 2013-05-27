/**
 * Project: springmvc
 * 
 * File Created at 2013-5-14ÏÂÎç10:35:19
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

import java.util.Date;


/**
 * @author zhen.wz
 * 2013-5-14ÏÂÎç10:35:19
 */
public class Student {
    
    private Long id;
    private String name;
    private String gender;
    private String address;
    private Date birthDay;
    
    
    public Student(){
    }
    
    public Student(Long id, String name, String gender, String address, Date birthDay) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthDay = birthDay;
    }

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public Date getBirthDay() {
        return birthDay;
    }
    
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
    
    
}
