package com.asiainfo.mapper;

import java.util.List;

import com.asiainfo.entity.User;
import com.asiainfo.entity.UserExt;
import com.asiainfo.vo.UserOrderVo;

/**
 * 用户Mapper（相当于dao接口）
 *
 * @author zhangzhiwang
 * @data 2017年6月4日 上午11:49:28
 */
public interface UserMapper {
	/**
	 * 增
	 * 
	 * @param user
	 * @author zhangzhiwang
	 * @data 2017年6月4日 下午12:01:21
	 */
	void insertUser(User user);// mybatis的mapper接口开发方法规范：1、用户名和statement的id相同 2、返回值和statement的resultType类型相同 3、参数类型和statement的parameterType相同 4、mapper.xml的命名空间和mapper接口的全限定名相同
								// mybatis通过这些规范自动生成（通过反射）mappper接口的代理实现对象

	/**
	 * 删
	 * 
	 * @param id
	 * @author zhangzhiwang
	 * @data 2017年6月4日 下午12:04:21
	 */
	void deleteById(int id);

	/**
	 * 改
	 * 
	 * @param id
	 * @author zhangzhiwang
	 * @data 2017年6月4日 下午12:04:52
	 */
	void updateById(User user);

	/**
	 * 通过id查询用户
	 * 
	 * @param id
	 * @return
	 * @author zhangzhiwang
	 * @data 2017年6月4日 下午12:07:18
	 */
	User querybyId(int id);

	/**
	 * 通过名称查询用户
	 * 
	 * @param name
	 * @return
	 * @author zhangzhiwang
	 * @data 2017年6月4日 下午12:07:57
	 */
	List<User> queryByName(String name);

	/**
	 * 通过订单号和用户名查询
	 * 
	 * @param number
	 * @param username
	 * @return
	 * @author zhangzhiwang
	 * @data 2017年6月8日 下午9:35:34
	 */
	List<UserOrderVo> queryUserOrder(UserOrderVo userOrderVo);

	/**
	 * 查询总数
	 * 
	 * @return
	 * @author zhangzhiwang
	 * @data 2017年6月8日 下午11:29:25
	 */
	int selectTotleCount();

	/**
	 * 返回结果类型时ResultMap
	 * 
	 * @return
	 * @author zhangzhiwang
	 * @data 2017年6月8日 下午11:52:50
	 */
	User queryResultMap();

	/**
	 * 动态sql
	 * 
	 * @param user
	 * @return
	 * @author zhangzhiwang
	 * @data 2017年6月9日 下午2:45:36
	 */
	List<User> queryDynamicSql(User user);

	/**
	 * sql片段
	 * 
	 * @param user
	 * @return
	 * @author zhangzhiwang
	 * @data 2017年6月9日 下午3:35:05
	 */
	List<User> sqlSegment(User user);

	/**
	 * foreach
	 * 
	 * @param userOrderVo
	 * @return
	 * @author zhangzhiwang
	 * @data 2017年6月9日 下午4:26:41
	 */
	List<User> queryForeach(UserOrderVo userOrderVo);

	/**
	 * foreach
	 * 
	 * @param userOrderVo
	 * @return
	 * @author zhangzhiwang
	 * @data 2017年6月9日 下午4:42:05
	 */
	List<User> queryIdForeach(UserOrderVo userOrderVo);

	/**
	 * 一对多
	 * 
	 * @param name
	 * @return
	 * @author zhangzhiwang
	 * @data 2017年6月12日 上午11:40:02
	 */
	List<UserExt> queryOneToMulty(String name);

	/**
	 * 多对多
	 * 
	 * @param name
	 * @return
	 * @author zhangzhiwang
	 * @data 2017年6月12日 下午1:21:46
	 */
	List<UserExt> queryMultiToMulti(String name);
	
	/**
	 * 一对多延迟加载
	 * 
	 * @param id
	 * @return
	 * @author zhangzhiwang
	 * @data 2017年6月12日 下午4:01:32
	 */
	UserExt queryOneToMultiLazyLoad(int id);
}
