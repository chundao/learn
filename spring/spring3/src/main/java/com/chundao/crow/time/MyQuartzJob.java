/**
 * Project: spring3
 * 
 * File Created at 2013-5-28обнГ1:45:17
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
package com.chundao.crow.time;

import java.util.Date;

/**
 * @author zhen.wz
 * 2013-5-28обнГ1:45:17
 */
public class MyQuartzJob {
    
    public void execute(){
        System.out.println( "hello: " + new Date() );
    }

}
