package com.asiainfo.mapper;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Test;

import com.asiainfo.entity.Order;
import com.asiainfo.entity.User;
import com.asiainfo.entity.UserExt;
import com.asiainfo.vo.UserOrderVo;

import cn1.mapper.UserMapper;

public class UserMapperTest {
	private static SqlSession sqlSession;

	static {
		try {
			String resource = "mybatisGlobalConf.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
			sqlSession = sqlSessionFactory.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// @Test
	// public void testInsertUser() {
	// UserMapper userMappper = sqlSession.getMapper(UserMapper.class);
	//
	// User user = new User();
	// user.setBirthday(new Date());
	// user.setSex('f');
	// user.setUserName("name5");
	// user.setAddress("address5");
	// userMappper.insertUser(user);
	// sqlSession.commit();
	//
	// System.out.println(user);
	// }

	// @Test
	// public void testDeleteById() {
	// UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	// userMapper.deleteById(36);
	// sqlSession.commit();
	// }

	// @Test
	// public void testUpdateById() {
	// UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	// User user = new User();
	// user.setId(32);
	// user.setBirthday(new Date());
	// user.setSex('f');
	// user.setUserName("name5");
	// user.setAddress("address5");
	// userMapper.updateById(user);
	// sqlSession.commit();
	// }

	// @Test
	// public void testQuerybyId() {
	// UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	// User user = userMapper.querybyId(1);
	// System.out.println(user);
	// }
	//
	// @Test
	// public void testQueryByName() {
	// UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	// List<User> list =
	// userMapper.queryByName("小明");//mybatis会根据mapper接口中的返回值类型是单个实体还是集合来确定是调用selectOne()还是selectList()
	// System.out.println(list);
	// }

	// @Test
	// public void testQueryUserOrder() {
	// UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	// UserOrderVo userOrderVo = new UserOrderVo();
	//
	// UserExt userExt = new UserExt();
	// userExt.setUserName("五");
	// userOrderVo.setUserExt(userExt);
	//
	// Order order = new Order();
	// order.setNumber("1000010");
	// userOrderVo.setOrder(order);
	//
	// List<UserOrderVo> userOrderVos = userMapper.queryUserOrder(userOrderVo);
	// System.out.println(userOrderVos);
	// }

	// @Test
	// public void testSelectTotleCount() {
	// UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	// int count = userMapper.selectTotleCount();
	// System.out.println(count);
	// }

	// @Test
	// public void testQueryResultMap() {
	// UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	// User user = userMapper.queryResultMap();
	// System.out.println(user);
	// }

	// @Test
	// public void testQueryDynamicSql() {
	// UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	// User user = new User();
	// user.setSex('1');
	//// user.setUserName("张");
	// List<User> list = userMapper.queryDynamicSql(user);
	// System.out.println(list);
	// }

	// @Test
	// public void testSqlSegment() {
	// UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	// User user = new User();
	// user.setSex('1');
	//// user.setUserName("张");
	// List<User> list = userMapper.sqlSegment(user);
	// System.out.println(list);
	// }

	// @Test
	// public void testQueryForeach() {
	// UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	// UserOrderVo userOrderVo = new UserOrderVo();
	// userOrderVo.setIdList(Arrays.asList(1, 10, 16));
	// List<User> list = userMapper.queryForeach(userOrderVo);
	// System.out.println(list);
	// }

	// @Test
	// public void testQueryIdForeach() {
	// UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	// UserOrderVo userOrderVo = new UserOrderVo();
	// userOrderVo.setIdList(Arrays.asList(1, 10, 16));
	// List<User> list = userMapper.queryIdForeach(userOrderVo);
	// System.out.println(list);
	// }

	// @Test
	// public void testQueryOneToMulty() {
	// UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	// List<UserExt> list = userMapper.queryOneToMulty("王五");
	// System.out.println(list);
	// }

	// @Test
	// public void testQueryMultiToMulti() {
	// UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	// List<UserExt> list = userMapper.queryMultiToMulti("王五");
	// System.out.println(list);
	// }

	// @Test
	// public void testQueryOneToMultiLazyLoad() {
	// UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	// UserExt userExt = userMapper.queryOneToMultiLazyLoad(1);
	// System.out.println(userExt.getOrderExts().size());
	// }

	// @Test
	// public void testInternalCache() {
	// UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	// //第一次查询
	// User user1 = userMapper.querybyId(1);
	// System.out.println(user1);
	//
	// //执行commit()操作
	// userMapper.updateById(user1);
	// sqlSession.commit();
	//
	// //第二次查询
	// User user2 = userMapper.querybyId(1);
	// System.out.println(user2);
	// }

//	@Test
//	public void test2LevelCache() throws IOException {
//		/**
//		 * 实现二级缓存的条件：</br>
//		 * 1、全局配置文件开启二级缓存（默认为开启）：
//		 * <setting name="cacheEnabled" value="true"></setting> </br>
//		 * 2、开启某 mapper的缓存</br>
//		 * 3、实体类实现序列化接口</br>
//		 * 4、在sqlSession关闭的时候写入二级缓存</br>
//		 */
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
//				.build(Resources.getResourceAsStream("mybatisGlobalConf.xml"));
//		SqlSession sqlSession1 = sqlSessionFactory.openSession();
//		SqlSession sqlSession2 = sqlSessionFactory.openSession();
//		SqlSession sqlSession3 = sqlSessionFactory.openSession();
//
//		UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
//		UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
//		UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);
//
//		User user1 = userMapper1.querybyId(1);
//		System.out.println(user1);
////		userMapper1.queryByName("小明");
//		sqlSession1.close();// 关闭sqlSession才会往二级缓存写数据
//
//		User user2 = userMapper2.querybyId(1);
//		System.out.println(user2);
////		userMapper2.queryByName("小明");
//		sqlSession2.close();
//		
////		userMapper3.updateById(user2);
////		sqlSession.commit();//commit操作会清空一级、二级缓存
//
//		User user3 = userMapper3.querybyId(1);
//		System.out.println(user3);
////		userMapper3.queryByName("小明");
//		sqlSession3.close();
//
//	}
	
//	@Test
//	public void testCriteria() {
//		UserExample userExample = new UserExample();
//		userExample.createCriteria().andUsernameLike("小明");
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		List<cn1.po.User> list = userMapper.selectByExample(userExample);
//		System.out.println(list);
//	}

	@After
	public void close() {
		if (sqlSession != null) {
			sqlSession.close();
		}
	}

}
