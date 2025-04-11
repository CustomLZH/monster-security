package com.monster.security.core.bean.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author LiuZhaoHong
 * @date 2025/4/6
 */
@Data
public class EnumerateTypeVO {
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

    /**
     * 创建人id
     */
    private Long createId;

    /**
     * 创建人姓名
     */
    private String createName;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;

    /**
     * 更新人id
     */
    private Long updateId;

    /**
     * 更新人姓名
     */
    private String updateName;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDate;


}
