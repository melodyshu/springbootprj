package net.fxclass.springboot;

import net.fxclass.springboot.bean.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootconfigApplicationTests {

    @Autowired
    Emp emp;

    @Test
    public void contextLoads() {
        System.out.println(emp);
    }

}
