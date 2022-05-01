package com.cg.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DaoAspect {

    @Pointcut("execution(* org.springframework.data.repository.CrudRepository.*(..))")
    private void pointcut(){};

    @Before("pointcut()")
    public void doCheck(){
        System.out.println("check ... ");
    }
}
