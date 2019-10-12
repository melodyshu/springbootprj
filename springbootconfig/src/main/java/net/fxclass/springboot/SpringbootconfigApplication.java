package net.fxclass.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath:spring01.xml"})
@SpringBootApplication
public class SpringbootconfigApplication {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        SpringApplication.run(SpringbootconfigApplication.class, args);
    }

}
