/**
 * Project: springmvc
 * 
 * File Created at 2013-5-25ÏÂÎç12:20:53
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

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.chundao.crow.core.entity.Product;
import com.chundao.crow.core.service.ProductService;


/**
 * @author zhen.wz
 * 2013-5-25ÏÂÎç12:20:53
 */
@Controller
public class ProductController {
    
    @Resource
    private ProductService productService;

    public ProductController(){
    }

    @RequestMapping(value = "/productList.htm", method = RequestMethod.GET )
    public String showProductList( Model model ){
        List<Product> productList = productService.getAllProducts();
        model.addAttribute("productList", productList);
        return "product/listProduct";
    }
    
    @RequestMapping( value = "product.htm", method = RequestMethod.GET )
    public String showProductDetail( @RequestParam( value = "id" ) Integer id, Model model ){
        Product product  = productService.getProductById(id);
        model.addAttribute("product", product);
        return "product/showProduct";
    }
    
}
