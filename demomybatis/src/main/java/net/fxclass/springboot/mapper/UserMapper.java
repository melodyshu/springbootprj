package net.fxclass.springboot.mapper;

import net.fxclass.springboot.entities.Provider;
import net.fxclass.springboot.entities.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


public interface UserMapper {

    @Insert("insert into user(username,password) values(#{username},#{password})")
    int addUser(User user);

}
