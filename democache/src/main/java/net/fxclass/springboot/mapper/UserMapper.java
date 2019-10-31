package net.fxclass.springboot.mapper;

import net.fxclass.springboot.entities.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
    @Select("select * from user where id=#{id}")
    User getUserById(Integer id);

    @Update("update user set username=#{username},real_name=#{realName} where id=#{id}")
    int updateuser(User user);

    @Delete("delete from user where id=#{id}")
    int deleteUser(Integer id);
}
