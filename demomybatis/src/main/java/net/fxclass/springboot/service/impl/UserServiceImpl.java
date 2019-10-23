package net.fxclass.springboot.service.impl;

import net.fxclass.springboot.entities.User;
import net.fxclass.springboot.mapper.UserMapper;
import net.fxclass.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    UserMapper userMapper;

    @Transactional(isolation= Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    @Override
    public Boolean addUser(User user) {
        userMapper.addUser(new User("1","1"));
        userMapper.addUser(new User("12","12"));
        userMapper.addUser(new User("123","123"));
        userMapper.addUser(new User("1234","123"));
        userMapper.addUser(new User("12345","123"));
        userMapper.addUser(new User("123456","123"));
        userMapper.addUser(user);
        return true;
    }
}
