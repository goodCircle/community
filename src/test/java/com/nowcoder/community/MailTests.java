package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailTests {

    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void sendMailTest() {
        mailClient.sendMail("13310006196@163.com", "hello SpringMail", "i love sleep");
    }

    @Test
    public void sendHtmlMailTest() {
        Context context = new Context();
        context.setVariable("username", "sunday");

        String content = templateEngine.process("mail/demo", context);
        System.out.println(content);

    }
}
