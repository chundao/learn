/**
<<<<<<< HEAD
 * Project: springmvc
 * 
 * File Created at 2013-5-25下午2:20:07
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
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chundao.crow.core.entity.User;
import com.chundao.crow.core.service.UserService;
import com.chundao.crow.core.service.impl.UserServiceImpl;


/**
 * @author zhen.wz
 * 2013-5-25下午2:20:07
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
        
//        ObjectError error = null;
//        bingdingResult.addError(error);
//        FieldError fieldError = bingdingResult.getFieldError("aaa");
//        fieldError.
        
        if( bingdingResult.hasErrors() ){
            return "user/register";
        }
        
        userService.registerUser(user);
        
        model.addAttribute("user", user);
        return "user/welcome"; 
    }
    
=======
 * Project: springmvc File Created at 2013-5-25下午2:20:07 $Id$ Copyright 1999-2012 Alibaba.com Corporation Limited. All
 * rights reserved. This software is the confidential and proprietary information of Alibaba Company.
 * ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package com.chundao.crow.mvc;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;

import com.chundao.crow.core.entity.User;
import com.chundao.crow.core.service.UserService;

/**
 * @author zhen.wz 2013-5-25下午2:20:07
 */
@Controller
@RequestMapping(value = "/user")
public class UserControllor {

    @Resource
    private UserService userService;

    // @RequestMapping( value = "/login" )
    // public String login( ){
    //
    // }

    @RequestMapping(value = "/register.htm", method = RequestMethod.GET)
    public String beforeRegister(Model model) {
        model.addAttribute("user", new User());
        return "user/register";
    }

    @RequestMapping(value = "/regiesterBack.htm", method = RequestMethod.POST)
    public String register(User user, BindingResult bingdingResult, Model model) {

        if (bingdingResult.hasErrors()) {
            return "user/register";
        }

        userService.registerUser(user);

        model.addAttribute("user", user);
        return "user/welcome";
    }

    @RequestMapping(value = "/upload.htm", method = RequestMethod.GET)
    public String upload(Model model) {
        model.addAttribute("user", new User());
        return "user/upload";
    }

    @RequestMapping(value = "/uploadBack", method = RequestMethod.POST)
    public String uploadBack(User user, @RequestParam(value = "image") MultipartFile multipartFile, Model model) {

        model.addAttribute("user", user);

        if (!multipartFile.isEmpty()) {
            String path = "D:/temp/";
            String fileName = multipartFile.getOriginalFilename();
            File file = new File(path + fileName);
            try {
                FileUtils.writeByteArrayToFile(file, multipartFile.getBytes());
                model.addAttribute("image", fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "user/upload";
        // return "user/uploadBack";
    }

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public String handleException(MaxUploadSizeExceededException exception, HttpServletRequest request, Model model) {
        model.addAttribute("msg", "file size exceed");
        return "error";
    }

>>>>>>> 20cf962c428e23dd472e0659c60e5da1c9e50a4a
}
