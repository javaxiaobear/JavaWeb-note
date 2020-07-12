package com.xiaobear.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author XiaoBear
 * @version 1.0
 * @Description
 * @date 2020/5/16 0016 20:33
 */
@WebServlet(name = "RequestMethodServlet",urlPatterns = "/requestMethodServlet")
public class RequestMethodServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        //返回当前链接使用的协议
        String scheme = req.getScheme();
        //服务器名
        String serverName = req.getServerName();
        //端口
        int serverPort = req.getServerPort();
        //项目名
        String contextPath = req.getContextPath();
        writer.write(scheme);
        writer.write(serverName);
        writer.write(serverPort);
        writer.write(contextPath);
    }
}
