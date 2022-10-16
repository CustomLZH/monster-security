package com.monster.security.core.bean.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;
import java.io.Serializable;

/**
 * 用户表
 * @author SystemGenerate
 */
@Data
@TableName("t_security_user")
public class SecurityUser implements Serializable {
	/**
	 * 编号
	 */
	@TableId(value = "i_id", type = IdType.ASSIGN_ID)
	private Long id;

	/**
	 * 姓名
	 */
	@TableField(value = "s_name")
	private String name;

	/**
	 * 昵称
	 */
	@TableField(value = "s_nickname")
	private String nickname;

	/**
	 * 账号
	 */
	@TableField(value = "s_account")
	private String account;

	/**
	 * 邮箱
	 */
	@TableField(value = "s_email")
	private String email;

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

