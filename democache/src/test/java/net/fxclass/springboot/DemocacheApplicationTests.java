package net.fxclass.springboot;

import net.fxclass.springboot.entities.User;
import net.fxclass.springboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemocacheApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    UserService userService;

    @Autowired
    RedisTemplate jsonRedisTemplate;

    @Test
    public void contextLoads() {
        //stringRedisTemplate.opsForValue().set("name","张三");
        String name = stringRedisTemplate.opsForValue().get("name");
        System.out.println(name);
        stringRedisTemplate.opsForList().leftPush("list1","a");
        stringRedisTemplate.opsForList().leftPushAll("list1","b","c","d");
        List<String> list1 = stringRedisTemplate.opsForList().range("list1", 0, -1);
        System.out.println(list1);


    }

    @Test
    public void testRedis() {
       User user1 = userService.getUser(2);
        //redisTemplate.opsForValue().set("user1",user1);
        User user11 = (User) redisTemplate.opsForValue().get("user1");
        System.out.println(user11);
        jsonRedisTemplate.opsForValue().set("user2",user1);

    }
}
