package com.monster.security.core.controller;

import com.monster.commons.annotation.enums.EnableDictTranslate;
import com.monster.commons.beans.ResponseData;
import com.monster.security.core.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CustomLZH
 * @version 1.0
 * @date 2022/8/29 20:36
 * @since JDK1.8
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("test")
    @EnableDictTranslate
    public ResponseData<User> test() {
        User user = new User();
        user.setUserName("admin");
        user.setUserType(1);
        return ResponseData.succeed(user);
    }

}
