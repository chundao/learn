/**
 * Project: spring3
 * 
 * File Created at 2013-5-27ÏÂÎç7:24:21
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
package com.chundao.crow.webservices;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.chundao.crow.core.entity.Product;
import com.chundao.crow.core.service.ProductService;

/**
 * @author zhen.wz
 * 2013-5-27ÏÂÎç7:24:21
 */
@Component
@WebService( serviceName = "WebServiceProductService",
            portName = "webServiceProductServicePort",
            targetNamespace = "http://product.com" ) 
public class ProductServiceEndpoint {
    
    @Resource
    private ProductService productService;

    @WebMethod
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    
    @WebMethod
    public Product getProductById( Integer id ){
        return productService.getProductById(id);
    }
    
}
