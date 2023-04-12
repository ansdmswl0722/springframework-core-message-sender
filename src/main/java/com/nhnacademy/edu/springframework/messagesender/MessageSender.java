package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.User;

public interface MessageSender {

    boolean sendMessage(User user, String message);
}
