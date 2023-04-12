package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.stereotype.Component;

@Component
public class SmsMessageSender implements MessageSender {

    public SmsMessageSender() {
        System.out.println("SMS message initiated!!");
    }
    public void init() {
        System.out.println("SMS INIT------------------------");
    }
    @ElapsedTimeLog
    @Override
    public boolean sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber()+ ": " + message);
        return true;
    }
}
