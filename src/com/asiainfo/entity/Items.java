package com.asiainfo.entity;

import java.sql.Timestamp;

/**
 * 商品实体
 *
 * @author zhangzhiwang
 * @data 2017年6月12日 下午12:39:39
 */
public class Items {
	/** 商品id */
	private int id;
	/** 商品名称 */
	private String name;
	/** 商品价格 */
	private float price;
	/** 商品说明 */
	private String detail;
	/** 商品图片地址 */
	private String pic;
	/** 创建时间 */
	private Timestamp createtime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Timestamp getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + ", detail=" + detail + ", pic=" + pic + ", createtime=" + createtime + "]";
	}

}
