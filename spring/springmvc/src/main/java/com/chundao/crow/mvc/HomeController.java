/**
 * Project: springmvc
 * 
 * File Created at 2013-5-14ÏÂÎç10:18:11
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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chundao.crow.core.entity.Student;


/**
 * @author zhen.wz
 * 2013-5-14ÏÂÎç10:18:11
 */
@Controller
public class HomeController {

//    private StudentService studentService;
    
    public HomeController(){
    }
    
    @RequestMapping( value={ "/", "/home" }, method = RequestMethod.GET )
    public String showHamepage( Map<String,Object> model ){
        model.put("crows", getStudent() );
        return "home";
    }
    
    private List<Student> getStudent(){
        Student student1 = new Student(1L, "chaonan", "nv", "bengbu", new Date());
        Student student2 = new Student(2L, "wangzhen", "nan", "qingdao", new Date());
        Student student3 = new Student(3L, "hehe", "zhong", "beijing", new Date());
        
        List<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        
        return list;
    }
    
}
