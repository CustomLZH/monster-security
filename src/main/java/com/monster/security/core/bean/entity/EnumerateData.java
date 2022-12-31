package com.monster.security.core.bean.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
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
	@TableField(value = "i_id")
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
	@TableField(value = "i_create_id")
	private Long createId;

	/**
	 * 创建人姓名
	 */
	@TableField(value = "s_create_name")
	private String createName;

	/**
	 * 创建时间
	 */
	@TableField(value = "d_create_date")
	private Date createDate;

	/**
	 * 更新人id
	 */
	@TableField(value = "i_update_id")
	private Long updateId;

	/**
	 * 更新人姓名
	 */
	@TableField(value = "s_update_name")
	private String updateName;

	/**
	 * 更新时间
	 */
	@TableField(value = "d_update_date")
	private Date updateDate;

}

