package net.fxclass.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@MapperScan("net.fxclass.springboot.mapper")
@SpringBootApplication
public class DemocacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemocacheApplication.class, args);
    }

}
