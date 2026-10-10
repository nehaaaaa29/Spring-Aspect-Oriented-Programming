package com.example.Aspect_Oriented_Programming.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
//@Aspect
@Component
@Slf4j

public class LoggingAspect {

   // @Before("execution(* orderPackage(..))")
    //@Before("execution(* com.example.Aspect_Oriented_Programming.service.impL.ShipmentServiceImpl.*.orderPackage(..))")
   @Before("execution(* com.example.Aspect_Oriented_Programming.service.impL.ShipmentServiceImpl.*.*(..))")

   public void beforeOrderPackage(JoinPoint joinPoint) {
        log.info("Before orderPackage called from LoggingAspect kind, {} ", joinPoint.getKind());
       log.info("Before orderPackage called from LoggingAspect signature,{} ", joinPoint.getSignature());

   }

   @After("myLoggingAndAopMethodsPointCut()")
   public void AftermyLoggingAndAopMethodsPointCut(){
       log.info("After My Logging Annotation method call");

   }

   @Before("within(com.example.Aspect_Oriented_Programming..*)")
    public void beforeServiceImplCalls(){
       log.info("Service Impl calls");
   }
   @Before("myLoggingAndAopMethodsPointCut()")

      public void beforeTransactionalAnnotationCalls(){
       log.info("Before My Logging Annotation method call");

   }
   @Pointcut("@annotation(com.example.Aspect_Oriented_Programming.aspect.MyLogging) && within(com.example.Aspect_Oriented_Programming..*)")
   public void myLoggingAndAopMethodsPointCut(){

   }

}
