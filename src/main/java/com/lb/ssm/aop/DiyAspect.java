package com.lb.ssm.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
// Aspect
public class DiyAspect {

    @Pointcut("execution(* com.lb.ssm.service.*Service.get*(..))")
    public void pointCut(){};


    @Before("pointCut()")
    public void before(){
        System.out.println("----方法前置通知----");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("----方法最终通知----");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("方法返回后通知");
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("方法执行前环绕通知1");
        Object obj = pj.proceed();
        System.out.println("方法执行后环绕通知2");
        return obj;
    }

}
