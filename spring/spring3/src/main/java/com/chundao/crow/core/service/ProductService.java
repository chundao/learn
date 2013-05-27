/**
 * Project: springmvc
 * 
 * File Created at 2013-5-25ионГ11:41:41
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

import java.util.List;

import com.chundao.crow.core.entity.Product;


/**
 * @author zhen.wz
 * 2013-5-25ионГ11:41:41
 */
public interface ProductService {

    public List<Product> getAllProducts();
    
    public Product getProductById( Integer id );
    
}
