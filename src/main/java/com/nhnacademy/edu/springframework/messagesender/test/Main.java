package com.nhnacademy.edu.springframework.messagesender.test;

import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {

            MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);
            MessageSender smsMessageSender = context.getBean("smsMessageSender", MessageSender.class);

            User user = new User("com.gmail", "74471234");

            MessageSender email1 = context.getBean("emailMessageSender", MessageSender.class);
            email1.sendMessage(user, "왜!!");
            MessageSender sms1 = context.getBean("smsMessageSender", MessageSender.class);
            sms1.sendMessage(user, "why!!");
        }
    }
}
