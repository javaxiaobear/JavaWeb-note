package com.xiaobear.servlet;

import com.xiaobear.ImageUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author xiaobear
 * @version 1.0
 * @date 2020/6/5 0005 16:42
 */
@WebServlet(name = "LoginServlet",urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 禁止图像缓存
         */
        response.setHeader("Paragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        /**
         * 客户端跟服务端编码
         */
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=UTF-8");

        /*
        ImageUtils imageUtils = new ImageUtils();
        BufferedImage image = imageUtils.getImage(request, response);
        String text = imageUtils.getText();
        request.getSession().setAttribute("value", text);
        String value = (String) request.getAttribute("value");
        */
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String checkKey = request.getParameter("checkKey");
        if ("xiaobear".equals(username) && "123456".equals(password) ){
            if (request.getSession().getAttribute("value").equals(checkKey)){
                response.getWriter().write("恭喜你登录成功！");
            }else {
                request.setAttribute("msg","验证码错误，请重新输入！");
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }
        }else {
         request.setAttribute("msg1","用户名或密码错误");
         request.getRequestDispatcher("/login.jsp").forward(request, response);
       }
    }
}
