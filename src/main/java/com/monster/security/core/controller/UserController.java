package com.monster.security.core.controller;

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
    public String test() {
        return "xxx";
    }

}
