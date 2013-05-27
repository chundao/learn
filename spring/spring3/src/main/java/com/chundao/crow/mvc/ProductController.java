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

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.chundao.crow.core.entity.Product;
import com.chundao.crow.core.entity.User;
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
    
    @RequestMapping( value = "uploadFile.htm", method = RequestMethod.GET )
    public String uploadFile( //@RequestParam( value = "msg", required = false ) String msg,
                              Model model ){
        
//        if( msg != null &&  !"".equals(msg) ){
//            model.addAttribute("msg", msg );
//        }
        
        model.addAttribute("user", new User());
        return "product/uploadFile";
    }
    
    @RequestMapping( value = "uploadFileBack.htm", method = RequestMethod.POST )
    public String uploadFileBack( User user,
                                  @RequestParam( value = "image", required = true ) 
                                  MultipartFile fileItem,
                                  Model model
                                  ){
         
        if( !fileItem.isEmpty() ){
            if( !fileItem.getContentType().equals("image/jpeg") ){
                model.addAttribute("msg", "only jpg can be uploaded.");
            }
            else{
                model.addAttribute("msg", "success.");
                saveFile(fileItem,model);
            }
        }else{
            model.addAttribute("msg", "only jpg can be uploaded.");
        }
        
        return "product/uploadFile";
    }
    
    private void saveFile( MultipartFile fileItem, Model model ){
        try {
            String fileName = "D:/resources/" + System.currentTimeMillis() / 10000 + fileItem.getName().substring( fileItem.getName().lastIndexOf(".") );
            File file = new File( fileName );
            FileUtils.writeByteArrayToFile(file, fileItem.getBytes());
            model.addAttribute("msg", fileName);
        } catch (Exception e) {
            model.addAttribute("msg", "upload file error");
        }
    }
    
}
