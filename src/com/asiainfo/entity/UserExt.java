package com.asiainfo.entity;

import java.util.List;

/**
 * 用户实体扩展类
 *
 * @author zhangzhiwang
 * @data 2017年6月8日 下午9:26:56
 */
public class UserExt extends User {
	/** 订单id列表 */
	private List<Order> orderList;
	private List<OrderExt> orderExts;

	public List<OrderExt> getOrderExts() {
		return orderExts;
	}

	public void setOrderExts(List<OrderExt> orderExts) {
		this.orderExts = orderExts;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	@Override
	public String toString() {
		return "UserExt [orderList=" + orderList + ", orderExts=" + orderExts + "]";
	}

}
