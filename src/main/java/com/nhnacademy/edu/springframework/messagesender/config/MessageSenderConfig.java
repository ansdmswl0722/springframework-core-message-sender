package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.SmsMessageSender;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages ="com.nhnacademy.edu.springframework.messagesender")
@PropertySource("classpath:name.properties")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MessageSenderConfig {

    @Profile("real")
    @Bean("name")
    public String name2(){
        return "Kim";
    }

    @Profile("dev")
    @Bean("name")
    public String name1(){
        return "Moon";
    }

}
