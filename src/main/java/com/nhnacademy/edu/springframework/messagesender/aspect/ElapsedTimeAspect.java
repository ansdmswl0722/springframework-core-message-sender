package com.nhnacademy.edu.springframework.messagesender.aspect;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.AdviceSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.util.Arrays;


//@Aspect
//@Component
public class ElapsedTimeAspect {

//    @Around("execution(* com.nhnacademy.edu.springframework.messagesender.*.*(..))")
    public Object targetMessageSender(ProceedingJoinPoint pjp) throws Throwable{

        System.out.println();
        Object retVal = pjp.proceed();



        return  retVal;
    }
}
