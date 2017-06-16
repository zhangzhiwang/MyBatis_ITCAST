package com.asiainfo.entity;

import java.util.List;

/**
 * 订单明细扩展
 *
 * @author zhangzhiwang
 * @data 2017年6月12日 下午12:38:29
 */
public class OrderDetailExt extends OrderDetail {
	/** 商品列表 */
	private ItemsExt itemsExt;

	public ItemsExt getItemsExt() {
		return itemsExt;
	}

	public void setItemsExt(ItemsExt itemsExt) {
		this.itemsExt = itemsExt;
	}

	@Override
	public String toString() {
		return "OrderDetailExt [itemsExt=" + itemsExt + "]";
	}

}
