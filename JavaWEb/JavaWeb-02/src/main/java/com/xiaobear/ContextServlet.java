package com.xiaobear;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xiaobear
 * @version 1.0
 * @date 2020/4/20 0020 14:04
 */
public class ContextServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletConfig().getServletContext();
        String username = context.getInitParameter("username");
        System.out.println(username);
        System.out.println(context.getInitParameter("password"));
        System.out.println("获取当前工程路径："+context.getContextPath());
        System.out.println("工程部署的路径是："+context.getRealPath("/"));
    }
}
