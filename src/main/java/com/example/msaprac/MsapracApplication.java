package com.example.msaprac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsapracApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsapracApplication.class, args);
    }

}
