package com.asiainfo;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.asiainfo.entity.User;
import com.asiainfo.entity.UserNotAutoIncr;

/**
 * 测试mybatis
 *
 * @author zhangzhiwang
 * @data 2017年6月3日 上午10:50:23
 */
public class MyBatisTest {
//	@Test
//	public void testSelectOne() {
//		SqlSession sqlSession = null;
//		try {
//			// 1、通过mybatis全局配置文件生成SqlSessionFactory
//			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatisGlobalConf.xml"));
//			// 2、通过SqlSessionFactory构建SqlSession
//			sqlSession = sqlSessionFactory.openSession();
//			// 3、通过SqlSession操作数据库（SqlSession是一个接口，实际操作数据库的是Executor,Executor也是一个接口，它有两个实现类，一个是默认执行器，一个是缓存执行器）
//			User user = sqlSession.selectOne("testZzw.selectById", 1);
//
//			System.out.println(user);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			if (sqlSession != null) {
//				sqlSession.close();
//			}
//		}
//	}
//
//	@Test
//	public void testSelectList() {
//		SqlSession sqlSession = null;
//		try {
//			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatisGlobalConf.xml"));
//			sqlSession = sqlSessionFactory.openSession();
//			List<User> list = sqlSession.selectList("testZzw.selectByName", "小明");
//			
//			System.out.println(list);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			if (sqlSession != null) {
//				sqlSession.close();
//			}
//		}
//	}
	
//	@Test
//	public void test() {
//		SqlSession sqlSession = null;
//		try {
//			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatisGlobalConf.xml"));
//			sqlSession = sqlSessionFactory.openSession();
//			List<com.asiainfo.entity.Test> list = sqlSession.selectList("test.sl", "a");
//			
//			System.out.println(list);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			if (sqlSession != null) {
//				sqlSession.close();
//			}
//		}
//	}
//	
//	@Test
//	public void testInsert() {
//		SqlSession sqlSession = null;
//		
//		try {
//			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatisGlobalConf.xml"));
//			sqlSession = sqlSessionFactory.openSession();
//			
//			User user = new User();
//			user.setAddress("address2");
//			user.setBirthday(new Date());
//			user.setSex('m');
//			user.setUserName("name2");
//			
//			UserNotAutoIncr userNotAutoIncr = new UserNotAutoIncr();
//			userNotAutoIncr.setUserName("name");
//			
////			int num = sqlSession.insert("testZzw.insertAutoIncr", user);
//			sqlSession.insert("testZzw.insertNotAutoIncr", userNotAutoIncr);
//			// 需要提交
//			sqlSession.commit();
//			
//			System.out.println(userNotAutoIncr);
//		} catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			if(sqlSession != null) {
//				sqlSession.close();
//			}
//		}
//	}
	
//	@Test
//	public void testDelete() {
//		SqlSession sqlSession = null;
//		try {
//			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatisGlobalConf.xml"));
//			sqlSession = sqlSessionFactory.openSession();
//			int num = sqlSession.delete("testZzw.deleteById", 33);
//			sqlSession.commit();
//			
//			System.out.println(num);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if(sqlSession != null) {
//				sqlSession.close();
//			}
//		}
//	}
	
	@Test
	public void testUpdate() {
		SqlSession sqlSession = null;
		try {
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatisGlobalConf.xml"));
			sqlSession = sqlSessionFactory.openSession();
			
			User user = new User();
			user.setId(32);
			user.setUserName("name3");
			int num = sqlSession.update("testZzw.updateById", user);
			
			sqlSession.commit();
			System.out.println(num);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
	}
}
