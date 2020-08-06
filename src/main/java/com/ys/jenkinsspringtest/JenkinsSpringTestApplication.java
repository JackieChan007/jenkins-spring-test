package com.ys.jenkinsspringtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSpringTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsSpringTestApplication.class, args);
        System.out.println("test springboot");
    }

}
