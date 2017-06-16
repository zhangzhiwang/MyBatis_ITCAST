package com.asiainfo.vo;

import java.util.List;

import com.asiainfo.entity.Order;
import com.asiainfo.entity.UserExt;

/**
 * 用户订单vo
 *
 * @author zhangzhiwang
 * @data 2017年6月8日 下午9:21:37
 */
public class UserOrderVo {
	/** 用户 */
	private UserExt userExt;
	/** 订单 */
	private Order order;
	/** 用户id列表 */
	private List<Integer> idList;

	/** 用户姓名 */
	private String username;
	/** 订单号 */
	private String number;

	public List<Integer> getIdList() {
		return idList;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public UserExt getUserExt() {
		return userExt;
	}

	public void setUserExt(UserExt userExt) {
		this.userExt = userExt;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "UserOrderVo [userExt=" + userExt + ", order=" + order + ", idList=" + idList + ", username=" + username + ", number=" + number + "]";
	}

}
