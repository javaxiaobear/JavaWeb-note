package com.xiaobear.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author XiaoBear
 * @version 1.0
 * @date 2020/5/7 0007 15:26
 */
public class HelloServlet implements Servlet {

    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init方法被调用了");
        //可以获取Servlet 程序的别名servlet-name 的值
        System.out.println("HelloServlet 程序的别名是:" + servletConfig.getServletName());
        //获取初始化参数init-param
        System.out.println("初始化参数username 的值是;" + servletConfig.getInitParameter("username"));
        System.out.println("初始化参数url 的值是;" + servletConfig.getInitParameter("password"));
        //获取ServletContext 对象
        System.out.println(servletConfig.getServletContext());
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service方法被调用了");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("destroy方法被调用了");
    }
}
