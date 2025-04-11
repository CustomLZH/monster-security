package com.monster.security;

import com.monster.commons.beans.ResponseData;
import com.monster.security.core.bean.User;
import com.monster.security.core.controller.UserController;
import com.monster.security.core.service.UserService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author LiuZhaoHong
 * @date 2025/2/12
 */
@SpringBootTest
public class FieldTest {

    private static final Logger log = LoggerFactory.getLogger(FieldTest.class);
    @Autowired
    private UserService userService;
    @Autowired
    private UserController userController;

    @Test
    public void test() {
        log.info("测试");
        ResponseData<User> test = userController.test();

        System.out.println(test);

        log.info("测试结束");

    }

}
