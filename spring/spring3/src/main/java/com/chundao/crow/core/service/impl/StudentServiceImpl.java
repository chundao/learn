/**
 * Project: springmvc
 * 
 * File Created at 2013-5-14下午10:38:38
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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.chundao.crow.core.entity.Student;
import com.chundao.crow.core.service.StudentService;


/**
 * 类 StudentServiceImpl 的实现描述：TODO 类实现描述
 * @author zhen.wz
 * 2013-5-14下午10:38:38
 */
public class StudentServiceImpl implements StudentService {

    private static Map<Long,Student> dataSource;
    
    static{
        Student student1 = new Student(1L, "chaonan", "女", "蚌埠", null);
        dataSource.put(1L, student1);
        Student student2 = new Student(2L, "wangzhen", "男", "青岛", null);
        dataSource.put(2L, student2);
        Student student3 = new Student(3L, "hehe", "中", "北京", null);
        dataSource.put(3L, student3);
    }
    
    
    /**
     * @author zhen.wz
     * 2013-5-14下午10:38:38
     */
    @Override
    public List<Student> getAll() {
        List<Student> list = new ArrayList<Student>();
        Set<Entry<Long, Student>> entrySet = dataSource.entrySet();
        for( Entry<Long,Student> entry : entrySet ){
            list.add( entry.getValue() );
        }
        return list;
    }

}
