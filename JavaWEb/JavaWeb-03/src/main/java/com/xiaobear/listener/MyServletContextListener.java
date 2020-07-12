package com.xiaobear.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author XiaoBear
 * @version 1.0
 * @date 2020/4/27 0027
 */
public class MyServletContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext被创建了！！！");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext被销毁了！！！");

    }
}
