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
 * @date 2020/5/8 0008 12:25
 */
public class ContextServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取ServletContext 对象
        //ServletContext 是在web 工程部署启动的时候创建。在web 工程停止的时候销毁
        ServletContext context = getServletContext();
        Integer count = (Integer) context.getAttribute("count");
        if (count == null) {
            count = 1;
        }else {
            count++;
        }
        System.out.println(context);
        context.setAttribute("count",count);
        resp.getWriter().print(count);
        System.out.println("ContextServlet2 中获取域数据key1 的值是:"+ context.getAttribute("key1"));
    }
}
