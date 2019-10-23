package net.fxclass.springboot.controller;

import net.fxclass.springboot.entities.Bill;
import net.fxclass.springboot.entities.User;
import net.fxclass.springboot.mapper.BillMapper;
import net.fxclass.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping("/user")
    public User save(User user){
        userService.addUser(user);
        return user;
    }
}
