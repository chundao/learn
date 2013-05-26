/**
 * Project: springmvc
 * 
 * File Created at 2013-5-25ÏÂÎç2:20:07
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
package com.chundao.crow.mvc;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chundao.crow.core.entity.User;
import com.chundao.crow.core.service.UserService;


/**
 * @author zhen.wz
 * 2013-5-25ÏÂÎç2:20:07
 */
@Controller
@RequestMapping( value = "/user" )
public class UserControllor {
    
    @Resource
    private UserService userService;
    
//    @RequestMapping( value = "/login" )
//    public String login(  ){
//        
//    }
    
    @RequestMapping( value = "/register.htm", method = RequestMethod.GET )
    public String beforeRegister( Model model ){
        model.addAttribute("user", new User());
        return "user/register";
    }
    
    @RequestMapping( value = "/regiesterBack.htm", method = RequestMethod.POST )
    public String register( User user, BindingResult bingdingResult, Model model ){
        
        if( bingdingResult.hasErrors() ){
            return "user/register";
        }
        
        userService.registerUser(user);
        
        model.addAttribute("user", user);
        return "user/welcome"; 
    }
    
}
