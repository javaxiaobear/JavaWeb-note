package com.xiaobear.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author XiaoBear
 * @version 1.0
 * @date 2020/5/8 0008 12:30
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求参数
        System.out.println("-------------doGet------------");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String [] hobby = request.getParameterValues("hobby");
        System.out.println("用户名："+username);
        System.out.println("密码："+password);
        System.out.println("兴趣爱好："+ Arrays.asList(hobby));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置请求体的字符集为UTF-8，从而解决post 请求的中文乱码问题
        request.setCharacterEncoding("UTF-8");
        // 获取请求参数
        System.out.println("-------------doPost------------");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[]  hobby = request.getParameterValues("hobby");
        System.out.println("用户名："+username);
        System.out.println("密码："+password);
        System.out.println("兴趣爱好："+ Arrays.asList(hobby));
    }
}
