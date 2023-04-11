package com.nhnacademy.edu.springframework.messagesender.test;

import com.nhnacademy.edu.springframework.messagesender.MessageSendService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnotationMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.nhnacademy.edu.springframework.messagesender");

        MessageSendService messageSendService = context.getBean("messageSendService", MessageSendService.class);
        messageSendService.doSendMessage();



        context.close();
    }
}
