package com.xiaobear.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author XiaoBear
 * @version 1.0
 * @Description
 * @date 2020/5/29 0029 11:01
 */
@WebServlet(name = "LoginServlet",urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if ("xiaobear".equals(username)&&"123456".equals(password)){
            //成功 保存用户信息到cookie、Session
            //重定向到succ1.jsp
            Cookie cookie = new Cookie("username", username);
            resp.addCookie(cookie);
            HttpSession session = req.getSession();
            session.setAttribute("sname",username);
            resp.sendRedirect("/JavaWeb_Homework8_war_exploded/success/succ1.jsp");
        }else {
            /**
             *保存错误信息到req域，
             * 转发到succ2.jsp
             */
            req.setAttribute("msg","用户名或密码错误，请重试！！！");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }
}
