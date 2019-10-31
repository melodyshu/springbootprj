package net.fxclass.springboot.service;

import net.fxclass.springboot.entities.User;
import net.fxclass.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    @Cacheable(cacheNames = "user")
    public User getUser(Integer id){
        return userMapper.getUserById(id);
    }

    @CachePut(cacheNames = "user",key = "#user.id")
    public User updateUser(User user){
        userMapper.updateuser(user);
        return user;
    }

    @CacheEvict(cacheNames = "user",key = "#id")
    public Integer deleteUser(Integer id){
        userMapper.deleteUser(id);
        return id;
    }
}
