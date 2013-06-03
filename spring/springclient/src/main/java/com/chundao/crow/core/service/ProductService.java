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

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.chundao.crow.core.entity.Product;


/**
 * @author zhen.wz
 * 2013-5-25ионГ11:41:41
 */
@WebService( serviceName = "WebServiceProductService",
            portName = "webServiceProductServicePort",
            targetNamespace = "http://product.com" ) 
public interface ProductService {

    @WebMethod
    public List<Product> getAllProducts();
    
    @WebMethod
    public Product getProductById( Integer id );
    
}
