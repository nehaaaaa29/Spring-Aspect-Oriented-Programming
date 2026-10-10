package com.example.Aspect_Oriented_Programming.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class LoggingAspectV2 {
    @Before("allServiceMethodsPointCut()")
    public void beforeServiceMethodCalls(JoinPoint joinPoint){
        log.info("Before advice method call ,{}",joinPoint.getSignature());

    }
    @After("allServiceMethodsPointCut()")
    public void afterServiceMethodCalls(JoinPoint joinPoint){
        log.info("After advice method call ,{}",joinPoint.getSignature());

    }
    @Pointcut("execution(* com.example.Aspect_Oriented_Programming.service.*.*(..))")
    public void allServiceMethodsPointCut(){

    }
}
