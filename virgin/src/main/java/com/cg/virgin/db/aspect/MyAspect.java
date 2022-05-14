package com.cg.virgin.db.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut("execution( * com.cg.virgin.service.StudentService.register())")
    private void pointCut(){

    }

    @Before("pointCut()")
    public void before(){
        System.out.println("aspect invalidate ...");
    }
}
