package com.xiaobear.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author XiaoBear
 * @version 1.0
 * @Description
 * @date 2020/5/23 0023 16:07
 */
@WebServlet(name = "TestServlet",urlPatterns = "/testServlet")
public class TestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        int i = Integer.parseInt(num1);
        int j = Integer.parseInt(num2);
        int sum = i + j;
        request.setAttribute("key",sum);
        request.getRequestDispatcher("/receive.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        int i = Integer.parseInt(num1);
        int j = Integer.parseInt(num2);
        int sum = i + j;
        request.setAttribute("key",sum);
        request.getRequestDispatcher("/receive.jsp").forward(request,response);

    }
}
