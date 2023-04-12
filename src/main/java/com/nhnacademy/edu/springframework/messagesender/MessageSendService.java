package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class MessageSendService {

    @Value("${name}")
    private  String name;
    private final MessageSender messageSender;

    @Autowired
    public MessageSendService(@Qualifier("smsMessageSender") MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public boolean doSendMessage() {
        User user = new User("ansdmswl0722@gmail.com","01012341234");
        return messageSender.sendMessage(user,name+"hihi");


    }


}
