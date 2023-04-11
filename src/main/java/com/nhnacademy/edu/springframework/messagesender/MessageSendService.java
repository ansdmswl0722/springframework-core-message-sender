package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class MessageSendService {
    private MessageSender messageSender;

    @Value("${from}")
    private String from;
    @Autowired
    public void setSmsMessageSender(@SMS("smsMessageSender") MessageSender messageSender) {
        System.out.println("setMessageSender invoked!");
        this.messageSender = messageSender;

    }

    public void doSendMessage() {
        User user = new User("ansdmswl0722@gmail.com","01012341234");
        messageSender.sendMessage(user,from+"hihi");

    }
}
