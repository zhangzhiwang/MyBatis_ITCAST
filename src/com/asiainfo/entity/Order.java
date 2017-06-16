package com.asiainfo.entity;

import java.sql.Timestamp;

/**
 * 订单实体
 *
 * @author zhangzhiwang
 * @data 2017年6月8日 下午9:23:26
 */
public class Order {
	/** 订单id */
	private int id;
	/** 用户id */
	private int userId;
	/** 订单号 */
	private String number;
	/** 创建时间 */
	private Timestamp createTime;
	/** 说明 */
	private String note;

	// 业务属性
	/** 用户信息 */
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", number=" + number + ", createTime=" + createTime + ", note=" + note + ", user=" + user + "]";
	}

}
