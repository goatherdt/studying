package com.cg.virgin.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

//@Component
public class InitHandler implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("dddddddddddddddddddddddddddddddd");
    }
}
