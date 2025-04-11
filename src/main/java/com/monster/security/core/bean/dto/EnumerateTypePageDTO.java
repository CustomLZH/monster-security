package com.monster.security.core.bean.dto;

import com.monster.commons.beans.BeanPage;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author LiuZhaoHong
 * @date 2025/4/6
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class EnumerateTypePageDTO extends BeanPage {

    /**
     * 枚举类型
     */
    private String enumerateType;



}
