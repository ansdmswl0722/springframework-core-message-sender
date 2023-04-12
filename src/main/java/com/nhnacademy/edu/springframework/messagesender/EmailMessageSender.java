package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.stereotype.Component;

@Component
public class EmailMessageSender implements MessageSender {

    public EmailMessageSender(){
        System.out.println("Email message initiated!!");
    }

    public void init() {
        System.out.println("EMAIL INIT-------------------------");
    }

    public void destroy() {
        System.out.println("destroy method called in EmailMessageSender");
    }
    @Override
    public boolean sendMessage(User user, String message) {
        System.out.println("Email Message Sent " + user.getEmail()+ ": " + message);
        return true;
    }
}
