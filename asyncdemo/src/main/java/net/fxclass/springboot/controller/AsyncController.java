package net.fxclass.springboot.controller;

import net.fxclass.springboot.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    AsyncService asyncService;

    @GetMapping("/add")
    public String add(){
        asyncService.batchAdd();
        return "success";
    }
}
