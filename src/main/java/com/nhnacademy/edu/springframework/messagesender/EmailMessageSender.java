package com.nhnacademy.edu.springframework.messagesender;

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
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent " + user.getEmail()+ ": " + message);
    }
}
