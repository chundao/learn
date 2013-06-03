/**
 * Project: simplecxf
 * 
 * File Created at 2013-6-3обнГ1:21:57
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
package com.chundao.learn.simplecxf.getstart;

import javax.jws.WebService;

/**
 * @author zhen.wz
 * 2013-6-3обнГ1:21:57
 */
@WebService
public interface HelloWorld {
    
    String sayHi(String text);

}
