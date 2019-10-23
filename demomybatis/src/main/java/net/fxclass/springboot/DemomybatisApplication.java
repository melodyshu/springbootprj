package net.fxclass.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("net.fxclass.springboot.mapper")
@EnableTransactionManagement
@SpringBootApplication
public class DemomybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemomybatisApplication.class, args);
    }

}
