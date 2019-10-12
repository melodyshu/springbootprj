package net.fxclass.springboot.config;

import net.fxclass.springboot.service.EmpService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {

    @Bean
    public EmpService empService2(){
        System.out.println("emp组件注入成功...");
        return new EmpService();
    }
}
