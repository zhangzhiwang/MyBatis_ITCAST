package com.asiainfo.mapper;

import java.util.List;

import com.asiainfo.entity.Order;
import com.asiainfo.entity.OrderExt;

/**
 * 订单Mapper
 *
 * @author zhangzhiwang
 * @data 2017年6月10日 下午12:31:12
 */
public interface OrderMapper {
	/**
	 * 一对一查询
	 * 
	 * @return
	 * @author zhangzhiwang
	 * @data 2017年6月10日 下午12:32:57
	 */
	List<OrderExt> queryOneToOne();

	/**
	 * 一对一查询使用resultMap
	 * 
	 * @return
	 * @author zhangzhiwang
	 * @data 2017年6月10日 下午12:56:42
	 */
	List<Order> queryOneToOneResultMap();

	/**
	 * 延迟加载
	 * 
	 * @param id
	 * @return
	 * @author zhangzhiwang
	 * @data 2017年6月12日 下午3:26:29
	 */
	Order queryOneToOneLazyLoad(int id);
}
