package com.example.Aspect_Oriented_Programming.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class ValidationAspect {

    @Pointcut("execution(* com.example.Aspect_Oriented_Programming.service.impL.*.*(..))")
    public void allServiceMethodPointcut(){

    }
    @Around("allServiceMethodPointcut")
    public Object validateOrderId(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object args[]= proceedingJoinPoint.getArgs();

        Long orderId=(Long)args[0];
        if(orderId >0) return proceedingJoinPoint.proceed();
        return "Cannot call with negative order id";

    }
}
