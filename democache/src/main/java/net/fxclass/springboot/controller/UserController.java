package net.fxclass.springboot.controller;

import net.fxclass.springboot.entities.User;
import net.fxclass.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user = userService.getUser(id);
        return user;
    }

    @GetMapping("/update")
    public User getUser(User user){
        userService.updateUser(user);
        return user;
    }

    @GetMapping("/delete/{id}")
    public Integer deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
        return id;
    }
}
