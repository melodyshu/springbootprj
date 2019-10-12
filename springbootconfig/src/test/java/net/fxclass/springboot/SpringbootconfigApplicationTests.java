package net.fxclass.springboot;

import net.fxclass.springboot.bean.Emp;
import net.fxclass.springboot.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootconfigApplicationTests {

    @Autowired
    Emp emp;

    @Autowired
    ApplicationContext context;

    @Test
    public void sayhello() {
//        EmpService empService = (EmpService) context.getBean("empService");
//        empService.add();
        EmpService empService = (EmpService) context.getBean("empService2");
        empService.add();
    }

    @Test
    public void contextLoads() {
        System.out.println(emp);
    }

}
