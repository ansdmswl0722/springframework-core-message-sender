package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSendService {
    private final MessageSender messageSender;

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage() {
        User user = new User("ansdmswl0722@gmail.com","01012341234");
        messageSender.sendMessage(user,"hihi");
    }
}
