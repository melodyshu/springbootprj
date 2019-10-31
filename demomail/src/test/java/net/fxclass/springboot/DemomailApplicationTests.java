package net.fxclass.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemomailApplicationTests {

    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Test
    public void testSimple() {
        SimpleMailMessage message=new SimpleMailMessage();
        message.setSubject("放假通知");
        message.setText("国庆放假7天");
        message.setFrom("1321497435@qq.com");
        message.setTo("1017097775@qq.com");
        javaMailSender.send(message);
    }

    @Test
    public void testMime() throws Exception {
        MimeMessage mimeMessage=javaMailSender.createMimeMessage();
        MimeMessageHelper message=new MimeMessageHelper(mimeMessage,true);
        message.setSubject("放假通知");
        message.setText("<h2 style='color:red'>国庆放假7天</h2>",true);
        message.addAttachment("哈哈.jpg",new File("C:\\Users\\Administrator\\Desktop\\哈哈.jpg"));
        message.setFrom("1321497435@qq.com");
        message.setTo("1017097775@qq.com");
        javaMailSender.send(mimeMessage);
    }

}
