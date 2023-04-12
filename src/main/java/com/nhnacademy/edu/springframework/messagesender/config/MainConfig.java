package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
public class MainConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public MessageSender emailMessageSender(){
        return new EmailMessageSender();

    }

}
