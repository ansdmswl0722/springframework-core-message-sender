package com.nhnacademy.edu.springframework.messagesender;

public class Singleton {

     private static  Singleton instance;

     private Singleton() {}

    public static Singleton getInstance() {
         return LazyHolder.SINGLETON;
    }

    private static class LazyHolder {
         private static final Singleton SINGLETON= new Singleton();
    }
}
