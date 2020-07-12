package com.xiaobear;

import sun.management.Agent;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xiaobear
 * @version 1.0
 * @date 2020/4/19 0019 22:03
 */
public class RequestApiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("获取请求的路径=>"+ req.getRequestURI());
        System.out.println("获取统一资源定位符=>"+ req.getRequestURL());
        System.out.println("获取ip=>"+req.getRemoteHost());
        System.out.println("获取请求头=>"+req.getHeader("User-Agent"));
        System.out.println("请求方式=>"+req.getMethod());
    }
}
