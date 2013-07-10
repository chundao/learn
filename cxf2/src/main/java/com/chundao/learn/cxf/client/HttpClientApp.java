/**
 * Project: cxf
 * 
 * File Created at 2013-7-6ÏÂÎç2:20:21
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
package com.chundao.learn.cxf.client;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author zhen.wz
 * 2013-7-6ÏÂÎç2:20:21
 */
public class HttpClientApp {
    
    private final static Logger logger = LoggerFactory.getLogger(HttpClientApp.class); 

    private static void testHttp(){
        
        try {
            HttpClient httpClient = new DefaultHttpClient();
//            String url = "http://localhost/cxf/rest_product/products/1";
            String url = "http://localhost/cxf/rest_product/products";
//            String url = "http://localhost/cxf/rest_product/say/chundao";
            
            HttpGet getReq = new HttpGet(url); 
            
//            getReq.setHeader("Accpet", "text/plain");
//            getReq.setHeader("Accpet", "application/xml");
            getReq.setHeader("Accpet", "application/json");
            
            
            HttpResponse response = httpClient.execute(getReq);
            
            HttpEntity entity = response.getEntity();
            
            byte[] byteArray = IOUtils.toByteArray(entity.getContent());
            String str = new String(byteArray);
            
            logger.info(str);
            
        } catch (Exception e) {
            logger.error("error",e);
        }
        
        
    }
    
    
    public static void main(String[] args) {
        testHttp();
    }

}
