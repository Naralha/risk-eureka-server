package com.example.testeeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TesteEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TesteEurekaServerApplication.class, args);
    }

}
