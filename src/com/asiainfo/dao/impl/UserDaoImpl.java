package com.asiainfo.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.asiainfo.dao.IUserDao;
import com.asiainfo.entity.User;

/**
 * 用户dao接口实现
 *
 * @author zhangzhiwang
 * @data 2017年6月4日 上午10:40:06
 */
public class UserDaoImpl implements IUserDao {
	private SqlSessionFactory sqlSessionFactory;

	public UserDaoImpl() {
		super();
	}

	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		super();
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public void insert(User user) {
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			int num = sqlSession.insert("testZzw.insertAutoIncr", user);
			sqlSession.commit();
			System.out.println(num);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}

	@Override
	public void delete(int id) {
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			int num = sqlSession.delete("testZzw.deleteById", id);
			sqlSession.commit();
			System.out.println(num);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}

	@Override
	public void update(User user) {
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			int num = sqlSession.update("testZzw.updateById", user);
			sqlSession.commit();
			System.out.println(num);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}

	@Override
	public User query(int id) {
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			User user = sqlSession.selectOne("testZzw.selectById", id);
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return null;
	}

}
