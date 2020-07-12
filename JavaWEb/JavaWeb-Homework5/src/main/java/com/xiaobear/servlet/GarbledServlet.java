package com.xiaobear.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * @author XiaoBear
 * @version 1.0
 * @Description GarbledServlet请求与响应乱码问题
 * @date 2020/5/22 0021 12:21
 */
@WebServlet(name = "GarbledServlet",urlPatterns = "/garbledServlet")
public class GarbledServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        // 设置请求体的字符集为UTF-8，从而解决post 请求的中文乱码问题
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[]  hobby = request.getParameterValues("hobby");
        System.out.println("用户名："+username);
        System.out.println("密码："+password);
        System.out.println("兴趣爱好："+ Arrays.asList(hobby));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[]  hobby = request.getParameterValues("hobby");
        System.out.println("用户名："+username);
        System.out.println("密码："+password);
        System.out.println("兴趣爱好："+ Arrays.asList(hobby));

        /**
         * sendRedirect重定向
         * // 设置响应状态码302 ，表示重定向，（已搬迁）
         * resp.setStatus(302);
         * // 设置响应头，说明新的地址在哪里
         * resp.setHeader("Location", "http://localhost:8080/JavaWeb_Homework5_war_exploded/servlet2?username=1001");
         */
        response.sendRedirect("http://localhost:8080/JavaWeb_Homework5_war_exploded/servlet2?username=1001");
        /**
         * 响应中文乱码
         * response.setCharacterEncoding("UTF-8");
         *  通过响应头，设置浏览器也使用UTF-8 字符集
         * response.setHeader("Content-Type", "text/html; charset=UTF-8");
         */
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.write("获取数据成功！");
    }
}
