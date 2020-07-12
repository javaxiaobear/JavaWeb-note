package com.xiaobear.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author xiaobear
 * @version 1.0
 * @date 2020/6/5 0005 12:04
 */
@WebServlet(name = "ImageServlet2",urlPatterns = "/servlet2")
public class ImageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Test test = new Test();
            try {
                boolean image = test.getImage(request, response);
                response.getOutputStream();
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
}
