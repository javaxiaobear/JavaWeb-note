package com.xiaobear;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xiaobear
 * @version 1.0
 * @date 2020/4/19 0019 17:52
 */
public class HelloServlet extends HttpServlet {

    public HelloServlet() {
        System.out.println("构造器方法！");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("1、执行了init（）");
           }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("2、执行了service方法");
    }

    @Override
    public void destroy() {
        System.out.println("3、执行了destroy方法！");
    }
}
