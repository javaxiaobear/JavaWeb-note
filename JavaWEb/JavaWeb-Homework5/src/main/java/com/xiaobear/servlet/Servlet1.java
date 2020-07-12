package com.xiaobear.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author XiaoBear
 * @version 1.0
 * @Description Servlet1、Servlet2请求转发
 * @date 2020/5/22 0021 12:21
 */
@WebServlet(name = "Servlet1",urlPatterns = "/servlet1")
public class Servlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println("Servlet1请求的数据是："+username);
        Object key = request.getAttribute("key");
        System.out.println("key的值为："+key);
    }
}
