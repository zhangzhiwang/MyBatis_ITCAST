package com.asiainfo.mapper;

import java.util.List;
import java.util.Map;

import com.asiainfo.entity.OrderDetail;

/**
 * 订单明细Mapper接口
 *
 * @author zhangzhiwang
 * @data 2017年6月8日 下午3:23:32
 */
public interface OrderDetailMapper {
	/**
	 * 通过订单id和细目id查询
	 * 
	 * @param ordersId
	 * @param itemsId
	 * @return
	 * @author zhangzhiwang
	 * @data 2017年6月8日 下午3:29:35
	 */
	List<OrderDetail> queryByOrderAndItem(int ordersId, int itemsId, int itemsNum, int id);//, int itemsId
	
	/**
	 * 参数类型是Map
	 * 
	 * @param map
	 * @return
	 * @author zhangzhiwang
	 * @data 2017年6月8日 下午9:04:36
	 */
	List<OrderDetail> queryByMap(Map<String, Object> map);
}
