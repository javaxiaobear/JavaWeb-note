package com.xiaobear.servlet;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author XiaoBear
 * @version 1.0
 * @date 2020/4/30 0030
 */
public class Download extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取下载的文件名
        String downFile = "t011c6cdb031350fcb6.jpg";
        //读取下载的文件内容
        ServletContext context = getServletContext();
        //获取下载的文件类型
        String mimeType = context.getMimeType("/file/"+downFile);
        System.out.println("下载的文件类型："+mimeType);
        //在回传前，通过响应头告诉客户端返回的数据类型
        resp.setContentType(mimeType);
        resp.setHeader("Content-Disposition", "attachment; fileName=t011c6cdb031350fcb6.jpg");
        //告诉客户端收到的数据类型是用于下载
        InputStream stream = context.getResourceAsStream("/file/"+downFile);
        //获取输出流
        ServletOutputStream outputStream = resp.getOutputStream();
        //读取全部数据，复制给输出流，输出给客户端
        IOUtils.copy(stream,outputStream);
        //把下载的内容回传给客户端


    }
}
