package com.nhnacademy.edu.springframework.messagesender.test;

import com.nhnacademy.edu.springframework.messagesender.MessageSendService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionMain {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")){
            MessageSendService messageSendService = context.getBean("messageSendService", MessageSendService.class);
            messageSendService.doSendMessage();
        }
    }
}
