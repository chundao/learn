/**
 * Project: cxf
 * 
 * File Created at 2013-7-6ÏÂÎç12:26:08
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
package com.chundao.learn.cxf.service.interfaces;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.chundao.learn.cxf.entity.Product;


/**
 * @author zhen.wz
 * 2013-7-6ÏÂÎç12:26:08
 */
@Path("/rest_product")
public interface ProductService {
    
    @GET   
    @Produces (MediaType.TEXT_PLAIN)   
    @Path("/say/{name}")   
    public String say(@PathParam("name")String name);  
    
    @GET
    @Produces ({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) 
    @Path("/products")
    public List<Product> getAllProducts();
    
    @GET
    @Produces ({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) 
    @Path("/products/{id}")
    public Product getProductById( @PathParam("id") Integer id );
    
    @POST
    @Produces ({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) 
    @Path("/products")
    public Product addProduct(Product product);
    
    @PUT
    @Produces ({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) 
    @Path("/products/{id}")
    public Product update( Product product );
    
    @DELETE
    @Produces ({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) 
    @Path("/products/{id}")
    public Product delete( @PathParam("id") Integer id);

}
