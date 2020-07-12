package com.xiaobear.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author XiaoBear
 * @version 1.0
 * @date 2020/5/14 0014 18:50
 */
public class SendRedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         *
         * 设置响应状态码302 ，表示重定向，（已搬迁）
         * 设置响应头，说明新的地址在哪里
         */
        resp.setStatus(302);
        resp.setHeader("Location","http://localhost:8080/JavaWeb_homework3_war_exploded/requestViewsServlet");
        //resp.sendRedirect("http://localhost:8080/JavaWeb_homework3_war_exploded/requestViewsServlet");
        //请求转发
        req.getRequestDispatcher("/").forward(req,resp);
    }
}
