package com.xiaobear.servlet;

import lombok.SneakyThrows;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author XiaoBear
 * @version 1.0
 * @date 2020/4/30 0030
 */
public class UploadServlet extends HttpServlet {

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /* System.out.println("文件已上传");
        ServletInputStream inputStream = req.getInputStream();
        byte[] buffer = new byte[10240000];
        int read = inputStream.read(buffer);
        System.out.println(new String(buffer,0,read));*/
        //1 先判断上传的数据是否多段数据（只有是多段的数据，才是文件上传的）
        if(ServletFileUpload.isMultipartContent(req)){
            //创建FileItemFactory 工厂实现类
            FileItemFactory factory = new DiskFileItemFactory();
            // 创建用于解析上传数据的工具类ServletFileUpload 类
            ServletFileUpload upload = new ServletFileUpload(factory);
            try{
                // 解析上传的数据，得到每一个表单项FileItem
                List<FileItem> list = upload.parseRequest(req);
                // 循环判断，每一个表单项，是普通类型，还是上传的文件
                for (FileItem fileItem : list) {
                    if (fileItem.isFormField()) {
                            // 普通表单项
                        System.out.println("表单项的name 属性值：" + fileItem.getFieldName());
                                    // 参数UTF-8.解决乱码问题
                        System.out.println("表单项的value 属性值：" + fileItem.getString("UTF-8"));
                    } else {
                                                    // 上传的文件
                        System.out.println("表单项的name 属性值：" + fileItem.getFieldName());
                        System.out.println("上传的文件名：" + fileItem.getName());
                        fileItem.write(new File("e:\\" + fileItem.getName()));
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
