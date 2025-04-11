package com.monster.security;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author LiuZhaoHong
 * @date 2025/2/12
 */
@Data
@Component
public class TestEntity {

    private static final Logger log = LoggerFactory.getLogger(TestEntity.class);
    private String name;


    public void test() {
        log.info("注解内部方法");
    }

}
