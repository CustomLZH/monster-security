package com.monster.security;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = {"com.monster"})
@MapperScan("com.monster.security.core.mapper")
public class MonsterSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonsterSecurityApplication.class, args);
    }

}
