package com.xiaobear.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author XiaoBear
 * @version 1.0
 * @date 2020/5/8 0008 12:10
 */
public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1、获取web.xml 中配置的上下文参数context-param
        ServletContext context = getServletConfig().getServletContext();
        String username = context.getInitParameter("username");
        System.out.println(username);
        System.out.println(context.getInitParameter("password"));
        System.out.println("获取当前工程路径:"+context.getContextPath());
        /**
         * / 斜杠被服务器解析地址为:http://ip:port/工程名/ 映射到IDEA 代码的web 目录<br/>
         */
        System.out.println("工程部署路径:"+context.getRealPath("/"));
        System.out.println("工程下img 目录1.jpg 的绝对路径是:" + context.getRealPath("/img/1.jpg"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
