package com.javase.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

public class ConnectionPool {

	private Vector<Connection> pool;
	
	//公共属性
	private String url = "jdbc:mysql://localhost:3306/test";
	private String username = "root";
	private String password = "root";
	private String driverClassName = "com.mysql.jdbc.Driver";
	
	private int poolSize = 100;
	private static ConnectionPool instance = null;
	Connection conn = null;
	
	/**
	 * 构造方法，做一些初始化工作
	 */
	private ConnectionPool(){
		pool = new Vector<Connection>(poolSize);
		for (int i = 0; i < poolSize; i++) {
			try {
				Class.forName(driverClassName);
				conn = DriverManager.getConnection(url, username, password);
				pool.add(conn);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	/**
	 * 返回连接到连接池
	 */
	public synchronized void release() {
		pool.add(conn);
	}
	
	/**
	 * 返回连接池中的一个数据库连接
	 * @return
	 */
	public synchronized Connection getConnection() {
		if (pool.size() > 0) {
			Connection connection = pool.get(0);
			pool.remove(connection);
			return connection;
		}else {
			return null;
		}
	}
}
