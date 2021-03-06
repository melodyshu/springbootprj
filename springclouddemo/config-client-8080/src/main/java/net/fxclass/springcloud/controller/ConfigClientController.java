package net.fxclass.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String port;

    @GetMapping("/config")
    public String getConfig(){
        String content="applicationName:"+applicationName+",port:"+port;
        System.out.println(content);
        return content;
    }
}
