package com.chundao.learn.springclient;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Map<String,String> map = new HashMap<String,String>();
        map.put("hello", "world");
        map.put("nihao", "1012");
        
        System.out.println( map );
        
    }
}
