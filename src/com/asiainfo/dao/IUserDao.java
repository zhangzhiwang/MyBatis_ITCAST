package com.asiainfo.dao;

import com.asiainfo.entity.User;

/**
 * 用户dao接口
 *
 * @author zhangzhiwang
 * @data 2017年6月4日 上午10:36:56
 */
public interface IUserDao {
	/**
	 * 增
	 * 
	 * @param user
	 * @author zhangzhiwang
	 * @data 2017年6月4日 上午10:37:52
	 */
	void insert(User user);

	/**
	 * 删
	 * 
	 * @param id
	 * @author zhangzhiwang
	 * @data 2017年6月4日 上午10:38:01
	 */
	void delete(int id);

	/**
	 * 改
	 * 
	 * @param user
	 * @author zhangzhiwang
	 * @data 2017年6月4日 上午10:38:51
	 */
	void update(User user);

	/**
	 * 查
	 * 
	 * @param id
	 * @return
	 * @author zhangzhiwang
	 * @data 2017年6月4日 上午10:39:01
	 */
	User query(int id);
}
