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
 * @date 2020/5/14 0014 15:36
 */
public class RequestViewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        System.out.println("工程部署的路径是:" + context.getRealPath("/"));
        Integer count = (Integer) context.getAttribute("count");
        if (count == null) {
            count = 1;
        }else {
            count++;
        }
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().print("这个页面共访问 "+ count +" 次！");
        context.setAttribute("count",count);

    }
}
