/**
 * Project: springmvc
 * 
 * File Created at 2013-5-25下午2:16:05
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

import java.util.HashMap;
import java.util.Map;

import com.chundao.crow.core.entity.User;
import com.chundao.crow.core.service.UserService;


/**
 * @author zhen.wz
 * 2013-5-25下午2:16:05
 */
public class UserServiceImpl implements UserService {
    
    private final static Map<String,User> map = new HashMap<String, User>();
    static{
        User user1 = new User("chundao", "hello", "111@163.com");
        map.put(user1.getUsername(), user1);
    }

    /**
     * @author zhen.wz
     * 2013-5-25下午2:16:05
     */
    @Override
    public User getUserByUsername(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @author zhen.wz
     * 2013-5-25下午2:16:05
     */
    @Override
    public User authicate(User user) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @author zhen.wz
     * 2013-5-25下午2:16:05
     */
    @Override
    public void registerUser(User user) {
        // TODO Auto-generated method stub

    }

}
