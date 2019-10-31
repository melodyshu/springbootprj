package net.fxclass.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: 梦学谷
 */
@EnableFeignClients(basePackages = "net.fxclass.springcloud.service")
@EnableEurekaClient
@SpringBootApplication
public class ProductFeign {

    public static void main(String[] args) {
        SpringApplication.run(ProductFeign.class, args);
    }

}
