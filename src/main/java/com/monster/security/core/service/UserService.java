package com.monster.security.core.service;

import com.monster.commons.annotation.enums.EnableDictTranslate;
import org.springframework.stereotype.Service;

/**
 * @author LiuZhaoHong
 * @date 2025/2/12
 */
@Service
public class UserService {

    public void addUser(String username) {
        System.out.println("Adding user: " + username);
    }

    public void deleteUser(String username) {
        System.out.println("Deleting user: " + username);
    }
}
