/**
 * Project: springmvc
 * 
 * File Created at 2013-5-25обнГ2:14:08
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
package com.chundao.crow.core.service;

import com.chundao.crow.core.entity.User;


/**
 * @author zhen.wz
 * 2013-5-25обнГ2:14:08
 */
public interface UserService {

    public User getUserByUsername(String username );
    
    public User authicate( User user );
    
    public void registerUser( User user );
    
}
