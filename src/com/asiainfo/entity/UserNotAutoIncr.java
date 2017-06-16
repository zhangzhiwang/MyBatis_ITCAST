package com.asiainfo.entity;

import java.util.Date;

/**
 * 用户实体（主键使用uuid）
 *
 * @author zhangzhiwang
 * @data 2017年6月3日 上午10:40:21
 */
public class UserNotAutoIncr {
	/** 用户id */
	private String id;
	/** 用户名 */
	private String userName;
	/** 生日 */
	private Date birthday;
	/** 性别 */
	private char sex;
	/** 地址 */
	private String address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserNotAutoIncr [id=" + id + ", userName=" + userName + ", birthday=" + birthday + ", sex=" + sex + ", address=" + address + "]";
	}

}
