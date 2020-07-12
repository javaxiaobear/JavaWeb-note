package com.xiaobear.servlet;

import com.xiaobear.utils.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author XiaoBear
 * @version 1.0
 * @date 2020/5/2 0002
 */
public class CookieServlet extends BaseServlet{

    /* Cookie的创建 */
    protected void creatCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1 创建Cookie 对象
        Cookie cookie = new Cookie("key4", "value4");
        //2 通知客户端保存Cookie
        resp.addCookie(cookie);
        //1 创建Cookie 对象
        Cookie cookie1 = new Cookie("key5", "value5");
        //2 通知客户端保存Cookie
        resp.addCookie(cookie1);
        resp.getWriter().write("Cookie 创建成功");
    }
    /*
    Cookie的获取
    */
    protected void getCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            //返回Cookie的名称
            resp.getWriter().write("Cookie["+cookie.getName()+"="+cookie.getValue()+"]<br>");
        }
    }

    /*
    *Cookie值修改
    */
    protected void updateCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        - 先创建一个要修改的同名（指的就是key）的Cookie 对象
        Cookie cookie = new Cookie("key4","newValue4");
//        - 在构造器，同时赋于新的Cookie 值。
        resp.addCookie(cookie);
//        - 调用response.addCookie( Cookie );

        Cookie cookie1 = CookieUtils.findCookie("key5", req.getCookies());
        if (cookie1 != null) {
            cookie1.setValue("newValue5");
        }
        resp.addCookie(cookie1);
        resp.getWriter().write("Cookie修改成功");
    }

    protected void defaultCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("default","default");
        cookie.setMaxAge(-1);
        resp.addCookie(cookie);
    }
    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 先找到你要删除的Cookie 对象
        Cookie cookie = CookieUtils.findCookie("key4", req.getCookies());
        if (cookie != null) {
            // 调用setMaxAge(0);
            cookie.setMaxAge(0); // 表示马上删除，都不需要等待浏览器关闭
            // 调用response.addCookie(cookie);
            resp.addCookie(cookie);
            resp.getWriter().write("key4 的Cookie 已经被删除");
        }
    }

    protected void pathCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("path","path");
        cookie.setPath(req.getContextPath()+"/abc");
        resp.addCookie(cookie);
        resp.getWriter().write("创建了一个带有path的Cookie");
    }
}
