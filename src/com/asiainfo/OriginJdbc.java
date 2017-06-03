package com.asiainfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 原始JDBC方式操作数据库</br>
 * jdbc的劣势：</br>
 * 1、功能代码和业务代码耦合在一起，或者说代码中存在大量与业务逻辑无关的且不得不写的代码</br>
 * 2、代码中存在应编码：（1）sql是写死的（2）preparedStatement设置参数时，给第几个占位符设置参数是写死的（3）从resultSet取数据时，字段名是写死的。代码写死就不利于更改和维护，因为要重新编译
 * 3、可读性下降，多个占位符（?）导致程序的可读性下降
 * 4、数据库连接用的时候开启，不用的时候关闭，有的程序员会忘记关闭，导致数据库连接会一直处于开启状态，浪费资源；频繁地开启或关闭连接，即频繁地进行io操作，影响系统性能
 * @author zhangzhiwang
 * @data 2017年5月31日 下午1:59:05
 */
public class OriginJdbc {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			// 加载数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 获取数据库连接
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf-8", "root", "");
			// sql语句
			String sql = "select * from user u where u.username = ?";
			// 获取预编译的Statement
			preparedStatement = connection.prepareStatement(sql);
			// 设置参数
			preparedStatement.setString(1, "王五");
			// 向数据库发送sql并返回查询结果
			resultSet = preparedStatement.executeQuery();

			// 遍历结果集获取数据
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("id"));
				System.out.println(resultSet.getString("username"));
				System.out.println(resultSet.getDate("birthday"));
				System.out.println(resultSet.getCharacterStream("sex"));
				System.out.println(resultSet.getString("address"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 各种关闭
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
