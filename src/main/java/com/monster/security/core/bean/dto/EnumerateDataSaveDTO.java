package com.monster.security.core.bean.dto;

import lombok.Data;

/**
 * @author LiuZhaoHong
 * @date 2025/4/11
 */
@Data
public class EnumerateDataSaveDTO {

    /**
     * 编号
     */
    private Long id;

    /**
     * 枚举类型
     */
    private String enumerateType;


    /**
     * 枚举描述
     */
    private String enumerateLabel;

    /**
     * 枚举键值
     */
    private String enumerateKey;

    /**
     * 枚举排序
     */
    private Integer enumerateSort;

}
