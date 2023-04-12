package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.config.MessageSenderConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service("messageSendService")
public class MessageSendService {

    String nameType;
    @Value("${name}")
    private  String name;
    private final MessageSender messageSender;

    @Autowired
    public MessageSendService( MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @Autowired
    public void setName(@Qualifier("name") String name){
        this.nameType = name;
    }

    @Autowired
    @Qualifier("name")
    String userName;


    public boolean doSendMessage() {
        User user = new User("ansdmswl0722@gmail.com","01012341234");
        return messageSender.sendMessage(user,userName + "," + name+"hihi");


    }


}
