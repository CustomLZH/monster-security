package com.monster.security.core.bean;

import com.monster.commons.annotation.enums.DictTranslateConfigure;
import lombok.Data;
import lombok.ToString;

/**
 * @author LiuZhaoHong
 * @date 2025/3/6
 */
@Data
@ToString
public class User {

    private String userName;

    @DictTranslateConfigure(dictType = "userType", fieldName = "userTypeText")
    private Integer userType;

    private String userTypeText;

}
