package com.example.Aspect_Oriented_Programming.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class LoggingAspectV2 {
    @Before("allServiceMethodsPointCut()")
    public void beforeServiceMethodCalls(JoinPoint joinPoint){
        log.info("Before advice method call ,{}",joinPoint.getSignature());

    }
    //@After("allServiceMethodsPointCut()")
    @AfterReturning(value = "allServiceMethodsPointCut()",returning = "returnObj")

    public void afterServiceMethodCalls(JoinPoint joinPoint, Object returnObj){
        log.info("After Returning advice method call ,{}",joinPoint.getSignature());
        log.info("After returning return value ,{}",returnObj);

    }
    @Pointcut("execution(* com.example.Aspect_Oriented_Programming.service.*.*(..))")
    public void allServiceMethodsPointCut(){

    }
}
