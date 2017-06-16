package com.asiainfo.dao.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.asiainfo.dao.IUserDao;
import com.asiainfo.entity.User;

public class UserDaoImplTest {
	private static IUserDao userDao;
	
	static {
		try {
			userDao = new UserDaoImpl(new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatisGlobalConf.xml")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	@Test
//	public void testInsert() {
//		User user = new User();
//		user.setBirthday(new Date());
//		user.setSex('f');
//		user.setUserName("name4");
//		user.setAddress("address3");
//		userDao.insert(user);
//	}
//
//	@Test
//	public void testDelete() {
//		userDao.delete(34);
//	}
//
//	@Test
//	public void testUpdate() {
//		User user = new User();
//		user.setId(31);
//		user.setUserName("name4");
//		userDao.update(user);
//	}

//	@Test
//	public void testQuery() {
//		System.out.println(userDao.query(1));
//	}

}
