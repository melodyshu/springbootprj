package net.fxclass.springboot.controller;

import net.fxclass.springboot.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/execute")
    public String success(Map<String,String> map) {
        map.put("name","繁星课堂");
        return "success";
    }

    @RequestMapping("/study")
    public String study(Map<String,Object> map, HttpServletRequest request){
        List<User> userList=new ArrayList<>();
        userList.add(new User("小张",1));
        userList.add(new User("小王",2));
        userList.add(new User("小李",1));
        map.put("userList",userList);
        map.put("gender",3);
        request.getSession().setAttribute("user",new User("小刘5",1));
        return "study";
    }

    @GetMapping("/bills")
    public String bill(){
        int a=9/0;
        return "study";
    }
}
