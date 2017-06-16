package com.asiainfo.mapper;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Test;

import com.asiainfo.entity.OrderDetail;

public class OrderDetailMapperTest {
	private static SqlSession sqlSession;

	static {
		try {
			sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatisGlobalConf.xml")).openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// @Test
	// public void testQueryByOrderAndItem() {
	// OrderDetailMapper orderDetailMapper = sqlSession.getMapper(OrderDetailMapper.class);
	// List<OrderDetail> list = orderDetailMapper.queryByOrderAndItem(3, 1, 1, 1);
	// System.out.println(list);
	// }

	@Test
	public void testQueryByMap() {
		OrderDetailMapper orderDetailMapper = sqlSession.getMapper(OrderDetailMapper.class);
		Map<String, Object> map = new HashMap<>();
		map.put("id", 1);
		map.put("orders_id_zzw1", 3);
		map.put("items_id_abc", 1);
		map.put("items_num_123", 1);

		List<OrderDetail> orderDetails = orderDetailMapper.queryByMap(map);
		System.out.println(orderDetails);
	}

	@After
	public void close() {
		if (sqlSession != null) {
			sqlSession.close();
		}
	}

}
