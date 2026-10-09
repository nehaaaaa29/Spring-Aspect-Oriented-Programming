package com.example.Aspect_Oriented_Programming.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
@Slf4j

public class LoggingAspect {

    @Before("execution(* com.codingshuttle.aopApp.services.impl.*.*(..))")
    public void beforeOrderPackage(JoinPoint joinPoint) {
        log.info("Before method call: {}", joinPoint.getSignature());
    }

}
