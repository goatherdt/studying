package com.cg.virgin.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class InitAware implements InstantiationAwareBeanPostProcessor {

    private int invokeCount;

    private int age;

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if(beanName.equals("studentService")){
            System.out.println("sssssssss");
            return new StudentService();
        }
        return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
    }
}
