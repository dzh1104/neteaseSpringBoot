package com.netease.accidence.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PetTest {
    
    @Autowired
    ApplicationContext context;
    
    @Test
    public void testSpringConfig() {
        // ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Pet pet = (Pet)context.getBean("pet");
        Pet pet2 = (Pet)context.getBean("pet2");
        System.out.println(pet);
        System.out.println(pet2);
    }
}