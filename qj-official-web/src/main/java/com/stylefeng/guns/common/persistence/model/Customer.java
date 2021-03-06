package com.stylefeng.guns.common.persistence.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 客户信息表
 * </p>
 *
 * @author stylefeng
 * @since 2018-05-06
 */
@TableName("of_customer")
public class Customer extends Model<Customer> {

    private static final long serialVersionUID = 1L;

	@TableId(value="Id", type= IdType.AUTO)
	private Integer Id;
    /**
     * 客户姓名
     */
	private String name;
    /**
     * 邮箱地址
     */
	private String email;
    /**
     * 手机号码
     */
	private String phone;
    /**
     * 详细描述
     */
	@TableField("detailed_description")
	private String detailedDescription;


	public Integer getId() {
		return Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDetailedDescription() {
		return detailedDescription;
	}

	public void setDetailedDescription(String detailedDescription) {
		this.detailedDescription = detailedDescription;
	}

	@Override
	protected Serializable pkVal() {
		return this.Id;
	}

	@Override
	public String toString() {
		return "Customer{" +
			"Id=" + Id +
			", name=" + name +
			", email=" + email +
			", phone=" + phone +
			", detailedDescription=" + detailedDescription +
			"}";
	}
}
