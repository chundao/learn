/**
 * Project: springmvc
 * 
 * File Created at 2013-5-25ÏÂÎç2:13:10
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

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


/**
 * @author zhen.wz
 * 2013-5-25ÏÂÎç2:13:10
 */
public class User {
    
//    @Size( min = 3, max = 10, message = "username must be between 3 an 10." )
//    @Pattern( regexp = "^[a-zA-Z0-9]+$", message = "username cannot involve spaces." )
    private String username;
//    @Size( min = 5, max = 10, message = "username must be between 5 an 10." )
    private String password;
//    @Size( min = 3, max = 10, message = "username must be between 3 an 10." )
    private String email;

    
    public User() {
    }

    /**
     * @param username
     * @param password
     * @param email
     */
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
}
