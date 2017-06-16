package com.asiainfo.entity;

import java.util.List;

/**
 * 订单实体扩展类
 *
 * @author zhangzhiwang
 * @data 2017年6月10日 下午12:28:16
 */
public class OrderExt extends Order {
	// 业务属性
	private String userName;
	private List<OrderDetailExt> orderDetails;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<OrderDetailExt> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetailExt> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "OrderExt [userName=" + userName + ", orderDetails=" + orderDetails + "]";
	}

}
