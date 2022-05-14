package com.cg.virgin.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public StudentService(){
        System.out.println("StudentService is being created...");
    }


    public void register(){
        System.out.println("recruit requires registering... ");
    }
}
