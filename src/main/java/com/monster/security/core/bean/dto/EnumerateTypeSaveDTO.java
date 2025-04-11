package com.monster.security.core.bean.dto;

import lombok.Data;

/**
 * @author LiuZhaoHong
 * @date 2025/4/11
 */
@Data
public class EnumerateTypeSaveDTO {
    /**
     * 编号
     */
    private Long id;

    /**
     * 枚举类型
     */
    private String enumerateType;

    /**
     * 枚举类型名称
     */
    private String enumerateName;

    /**
     * 备注
     */
    private String remark;
}
