package com.xiaobear.servlet;

import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "Servlet2",urlPatterns = "/servlet2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println("Servlet2请求的数据是："+username);
        request.setAttribute("key","xiaobear");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/servlet1");
        dispatcher.forward(request,response);
    }
}
