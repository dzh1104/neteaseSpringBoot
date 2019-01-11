package com.netease.accidence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath:spring-config.xml"})
@SpringBootApplication
public class AccidenceApplication {

public static void main(String[] args) {
    
    SpringApplication.run(AccidenceApplication.class, args);
}

}

