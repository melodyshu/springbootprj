package net.fxclass.servlet.demoservlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("servlet应用启动...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("servlet应用销毁...");
    }
}
