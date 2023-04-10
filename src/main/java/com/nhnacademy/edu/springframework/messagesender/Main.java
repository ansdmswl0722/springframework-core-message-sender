package com.nhnacademy.edu.springframework.messagesender;

public class Main {
    public static void main(String[] args) {
        EmailMessageSender emailMessageSender = new EmailMessageSender();
        MessageSendService messageSendService = new MessageSendService(emailMessageSender);
        messageSendService.doSendMessage();
    }



}
