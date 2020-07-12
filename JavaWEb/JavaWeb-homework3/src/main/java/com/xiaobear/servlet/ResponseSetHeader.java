package com.xiaobear.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author XiaoBear
 * @version 1.0
 * @date 2020/5/14 0014 18:49
 */
public class ResponseSetHeader extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.write("xiaobear是真的超棒！！！");
        //设置响应头
        resp.addHeader("17690137","xiaobear");
        // 设置刷新自动加载时间为 5 秒
        resp.setIntHeader("Refresh", 5);
        //设置响应头信息以及时间期限
        resp.setDateHeader("Expire",1000*60*60);
    }
}
