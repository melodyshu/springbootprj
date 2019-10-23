package net.fxclass.servlet.demoservlet.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init初始化...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("filter 过滤...");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("filter destory销毁...");
    }
}
