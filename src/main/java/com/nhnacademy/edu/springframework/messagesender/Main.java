package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        EmailMessageSender emailMessageSender = new EmailMessageSender();
//        MessageSendService messageSendService = new MessageSendService(emailMessageSender);
//        messageSendService.doSendMessage();
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {

            MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);
            MessageSender smsMessageSender = context.getBean("smsMessageSender", MessageSender.class);

            User user = new User("com.gmail", "74471234");

        //        emailMessageSender.sendMessage(user,"hihihi");
        //        smsMessageSender.sendMessage(user,"melong");

            MessageSender email1 = context.getBean("emailMessageSender", MessageSender.class);
            email1.sendMessage(user, "왜!!");
            MessageSender sms1 = context.getBean("smsMessageSender", MessageSender.class);
            sms1.sendMessage(user, "why!!");
        }
    }



}
