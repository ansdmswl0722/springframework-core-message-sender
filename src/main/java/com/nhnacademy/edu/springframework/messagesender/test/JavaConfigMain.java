package com.nhnacademy.edu.springframework.messagesender.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.nhnacademy.edu.springframework.messagesender");
        context.close();
    }
}
