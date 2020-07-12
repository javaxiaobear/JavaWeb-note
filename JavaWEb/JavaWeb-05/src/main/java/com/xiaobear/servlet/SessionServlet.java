package com.xiaobear.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author XiaoBear
 * @version 1.0
 * @date 2020/5/2 0002
 */
public class SessionServlet extends BaseServlet{

    protected void creatOrGetSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        boolean aNew = session.isNew();
        String id = session.getId();
        resp.getWriter().write("Session的ID:"+id+" ;");
        resp.getWriter().write("Session是否是新创建："+aNew+" ;");
    }
    protected void getSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object attribute = req.getSession().getAttribute("key1");
        resp.getWriter().write("从Session 中获取出key1 的数据是：" + attribute);
    }
    protected void setSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("key1", "value1");
        resp.getWriter().write("已经往Session 中保存了数据");
    }
    protected void setTime(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setMaxInactiveInterval(10);
        resp.getWriter().write("10s后超时！！1");
    }
    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
// 先获取Session 对象
        HttpSession session = req.getSession();
// 让Session 会话马上超时
        session.invalidate();
        resp.getWriter().write("Session 已经设置为超时（无效）");
    }
}
