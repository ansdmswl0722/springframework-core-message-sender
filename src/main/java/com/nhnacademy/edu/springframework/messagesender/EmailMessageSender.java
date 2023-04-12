package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component("messageSender")
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
    @ElapsedTimeLog
    @Override
    public boolean sendMessage(User user, String message) {
        System.out.println("Email Message Sent " + user.getEmail()+ ": " + message);
        return true;
    }
}
