package com.xiaobear.servlet;

import com.xiaobear.ImageUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author xiaobear
 * @version 1.0
 * @date 2020/6/5 0005 16:32
 */
@WebServlet(name = "ImageOutServlet",urlPatterns = "/imageOut")
public class ImageOutServlet extends HttpServlet {


    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        ImageUtils imageUtils = new ImageUtils();
        BufferedImage image = imageUtils.getImage(request, response);
        ImageUtils.output(image,response.getOutputStream());
    }
}
