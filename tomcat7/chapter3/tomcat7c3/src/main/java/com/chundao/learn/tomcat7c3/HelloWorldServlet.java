/**
 * Project: tomcat7c3
 * 
 * File Created at 2013-5-24下午2:07:19
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
package com.chundao.learn.tomcat7c3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author zhen.wz
 * 2013-5-24下午2:07:19
 */
@WebServlet( name = "helloWorldServlet",
             urlPatterns = "/hello.html",
             initParams = {
                           @WebInitParam( name = "message", value = "Hello tomcat7" )
             } )
public class HelloWorldServlet extends HttpServlet {

    private String message;
    
    /**
     * @author zhen.wz
     * 2013-5-24下午2:11:44
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        this.message = config.getInitParameter("message");
    }
    
    /**
     * @author zhen.wz
     * 2013-5-24下午2:12:19
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        
        PrintWriter out = resp.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World!</h1>");
        out.println("</body>");
        out.println("</html>");
        
    }
    
}
