package com.monster.security.core.bean.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.util.Date;
import java.io.Serializable;

/**
 * 枚举数据表
 * @author SystemGenerate
 */
@Data
@TableName("t_enumerate_data")
public class EnumerateData implements Serializable {
	/**
	 * 编号
	 */
	@TableId(value = "i_id", type = IdType.ASSIGN_ID)
	private Long id;

	/**
	 * 枚举类型
	 */
	@TableField(value = "s_enumerate_type")
	private String enumerateType;

	/**
	 * 枚举描述
	 */
	@TableField(value = "s_enumerate_label")
	private String enumerateLabel;

	/**
	 * 枚举键值
	 */
	@TableField(value = "s_enumerate_key")
	private String enumerateKey;

	/**
	 * 枚举排序
	 */
	@TableField(value = "s_enumerate_sort")
	private Integer enumerateSort;

	/**
	 * 创建人id
	 */
	@TableField(value = "i_create_id", fill = FieldFill.INSERT)
	private Long createId;

	/**
	 * 创建人姓名
	 */
	@TableField(value = "s_create_name", fill = FieldFill.INSERT)
	private String createName;

	/**
	 * 创建时间
	 */
	@TableField(value = "d_create_date", fill = FieldFill.INSERT)
	private Date createDate;

	/**
	 * 更新人id
	 */
	@TableField(value = "i_update_id", fill = FieldFill.INSERT_UPDATE)
	private Long updateId;

	/**
	 * 更新人姓名
	 */
	@TableField(value = "s_update_name", fill = FieldFill.INSERT_UPDATE)
	private String updateName;

	/**
	 * 更新时间
	 */
	@TableField(value = "d_update_date", fill = FieldFill.INSERT_UPDATE)
	private Date updateDate;

}

