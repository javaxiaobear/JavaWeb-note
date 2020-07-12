package com.xiaobear.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author XiaoBear
 * @version 1.0
 * @Description
 * @date 2020/5/15 0015 11:50
 */
public class RequestApiServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("获取请求的路径=>"+ request.getRequestURI());
        System.out.println("获取统一资源定位符=>"+ request.getRequestURL());
        System.out.println("获取ip=>"+request.getRemoteHost());
        System.out.println("获取端口号=>"+request.getRemotePort());
        System.out.println("获取请求头=>"+request.getHeader("User-Agent"));
        System.out.println("请求方式=>"+request.getMethod());
    }
}
