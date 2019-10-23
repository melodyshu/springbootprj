package net.fxclass.servlet.demoservlet.config;

import net.fxclass.servlet.demoservlet.filter.MyFilter;
import net.fxclass.servlet.demoservlet.listener.MyListener;
import net.fxclass.servlet.demoservlet.servlet.HelloServlet;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MyServletConfig {
    @Bean
    public ServletRegistrationBean helloServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new HelloServlet(), "/hello");
        bean.setLoadOnStartup(1);
        return bean;
    }

    @Bean
    public WebServerFactoryCustomizer webServerFactoryCustomizer(){
        return new WebServerFactoryCustomizer(){
            @Override
            public void customize(WebServerFactory factory) {
                ConfigurableWebServerFactory factory1 = (ConfigurableWebServerFactory) factory;
                factory1.setPort(8083);
            }
        };
    }

    @Bean
    public FilterRegistrationBean helloFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new MyFilter());
        bean.setUrlPatterns(Arrays.asList("/hello"));
        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean helloListener(){
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean(new MyListener());
        return bean;
    }
}
