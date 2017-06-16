package com.asiainfo.mapper;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Test;

import com.asiainfo.entity.Order;
import com.asiainfo.entity.OrderExt;
import com.asiainfo.entity.User;

public class OrderMapperTest {
	private static SqlSession sqlSession;
	
	static {
		try {
			sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatisGlobalConf.xml")).openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	@Test
//	public void testQueryOneToOne() {
//		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
//		List<OrderExt> list = orderMapper.queryOneToOne();
//		System.out.println(list);
//	}
	
//	@Test
//	public void testQueryOneToOneResultMap() {
//		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
//		List<Order> list = orderMapper.queryOneToOneResultMap();
//		System.out.println(list);
//	}
	
	@Test
	public void testQueryOneToOneLazyLoad() {
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		Order order = orderMapper.queryOneToOneLazyLoad(3);
		if(order == null) {
			fail();
		}
		//延迟加载的原理
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		User u = userMapper.querybyId(order.getUserId());
		
		User user = order.getUser();//使用的时候即为“需要的时候”
		System.out.println(user);
	}
	
	@After
	public void close() {
		if(sqlSession != null) {
			sqlSession.close();
		}
	}

}
