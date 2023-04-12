package com.nhnacademy.edu.springframework.messagesender.aspect;

import com.nhnacademy.edu.springframework.messagesender.ElapsedTimeLog;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
@Aspect
@Component
public class LoggingAspect {
    @Around("@annotation(com.nhnacademy.edu.springframework.messagesender.ElapsedTimeLog) && args(user,..)")
    public Object targetMessageSender(ProceedingJoinPoint pjp, User user) throws Throwable {
        StopWatch stopWatch = new StopWatch();

        try {
            stopWatch.start();
            Object retVal = pjp.proceed();
            return retVal;

        } catch (Throwable e) {
            e.printStackTrace();
            throw e;

        }finally {
            stopWatch.stop();
            System.out.println(user);
            System.out.println(stopWatch.prettyPrint());
//            System.out.println(user.getEmail());
//            System.out.println(user.getPhoneNumber());
        }
    }
}
