/**
 * Project: spring3
 * 
 * File Created at 2013-5-27上午9:13:00
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

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * @author zhen.wz
 * 2013-5-27上午9:13:00
 */
@WebServlet( urlPatterns = "/upload" )
public class FormServlet extends HttpServlet {

    /**   **/
    private static final long serialVersionUID = 2412205864788026065L;

    /**
     * @author zhen.wz
     * 2013-5-27上午9:13:45
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
//        ServletInputStream inputStream = req.getInputStream();
//        InputStreamReader r = new InputStreamReader(inputStream);
//        BufferedReader br = new BufferedReader(r);
//
//        String line = br.readLine();
//        while( line != null ){
//            System.out.println( line );
//            line = br.readLine();
//        }
        
        DiskFileItemFactory factory = new DiskFileItemFactory();
        String path = "D:/temp";
        factory.setRepository(new File(path));
        factory.setSizeThreshold(1024*1024);
        ServletFileUpload upload = new ServletFileUpload(factory);
        try {
//            Map<String, List<FileItem>> paramMap = upload.parseParameterMap(req);
//            Set<String> keySet = paramMap.keySet();
//            for( String key : keySet ){
//                System.out.println( key );
//            }
            
            List<FileItem> params = upload.parseRequest(req);
            for( FileItem item : params ){
               if( item.isFormField() ){
                   // 表单参数
                   String name = item.getFieldName();
                   String value = item.getString();
                   req.setAttribute(name,value);
               }else{
                 //表单域是文件类型的情况
                   String name = item.getFieldName();
                   String value = item.getName();
                   int start = value.lastIndexOf("\\");
                   String fileName = value.substring(start+1);
                   req.setAttribute(name,fileName);
                   //上传
                   item.write(new File(path,fileName));
               }
            }
            
        } catch (FileUploadException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        
        Enumeration<String> attributeNames = req.getAttributeNames();
        while( attributeNames.hasMoreElements() ){
            String attrKey = attributeNames.nextElement();
            String attrValue = (String)req.getAttribute(attrKey);
            out.println(attrKey + ":" + attrValue);
        }
        
        out.println("</body>");
        out.println("</html>");
        
    }
    
    
}
