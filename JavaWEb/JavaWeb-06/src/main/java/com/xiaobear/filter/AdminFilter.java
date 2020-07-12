package com.xiaobear.filter;


import com.sun.net.httpserver.HttpExchange;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author XiaoBear
 * @version 1.0
 * @date 2020/5/3 0003 22:53
 */
public class AdminFilter implements Filter {

    public AdminFilter() {
        System.out.println("1、构造器方法");
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("2、初始化方法");
        System.out.println("filter-name的值是："+filterConfig.getFilterName());
        System.out.println("init-param中username的值是："+filterConfig.getInitParameter("username"));
        System.out.println(filterConfig.getServletContext());
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("3、doFilter过滤方法");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");
        if (user == null) {
            servletRequest.getRequestDispatcher("/login.jsp").forward(servletRequest,servletResponse);
        }else {
            //让程序继续访问目标资源
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }
    public void destroy() {
        System.out.println("4、destory方法");
    }
}
