package com.monster.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MonsterSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonsterSecurityApplication.class, args);
    }

}
