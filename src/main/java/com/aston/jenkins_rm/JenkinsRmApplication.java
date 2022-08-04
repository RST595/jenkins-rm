package com.aston.jenkins_rm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsRmApplication {


    @GetMapping
    public String message() {
        return "Hi, this is app for Jenkins testing. V1.0";
    }
    public static void main(String[] args) {
        SpringApplication.run(JenkinsRmApplication.class, args);
    }

}
