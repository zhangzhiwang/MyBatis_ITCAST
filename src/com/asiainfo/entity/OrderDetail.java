package com.asiainfo.entity;

/**
 * 订单明细表
 *
 * @author zhangzhiwang
 * @data 2017年6月8日 下午3:19:48
 */
public class OrderDetail {
	private int id;
	private int ordersId;
	private int itemsId;
	private int itemsNum;

	public OrderDetail(int id, int ordersId, int itemsId, int itemsNum) {
		super();
		this.id = id;
		this.ordersId = ordersId;
		this.itemsId = itemsId;
		this.itemsNum = itemsNum;
	}

	public OrderDetail() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}

	public int getItemsId() {
		return itemsId;
	}

	public void setItemsId(int itemsId) {
		this.itemsId = itemsId;
	}

	public int getItemsNum() {
		return itemsNum;
	}

	public void setItemsNum(int itemsNum) {
		this.itemsNum = itemsNum;
	}

	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", ordersId=" + ordersId + ", itemsId=" + itemsId + ", itemsNum=" + itemsNum + "]";
	}

}
