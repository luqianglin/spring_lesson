package cn.et.lession4.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
/**
 * 编程式事务
 * 声明式事务
 * 	 xml声明(全局)
 * 	注解声明
 * @author Administrator
 *
 */
public class Test {
	static DataSource dataSource;
	static Connection conn;
	static{
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lession4/jdbc/spring.xml");
		dataSource=(DataSource)context.getBean("dataSource");
	}
	public static void main(String[] args) throws SQLException {
		try {
				//前置通知	
			conn = dataSource.getConnection();
			conn.setAutoCommit(false);
			//业务逻辑
			//默认是自动提交
			aminus(10);
			int i = 5 / 0;
			badd(10);
			//后置通知
			conn.commit();
		}catch (Exception e){
			e.printStackTrace();
			conn.rollback();
			
		}finally {
			conn.close();
		}
				
	}
	public static void aminus(int money) throws SQLException {
		String sql="update mymoney set lostedmoney=lostedmoney-"+money+" where userName='A'";
		conn.prepareStatement(sql).executeUpdate();
	}
	public static void badd(int money) throws SQLException{
		String sql="update mymoney set lostedmoney=lostedmoney+"+money+" where userName='B'";
		conn.prepareStatement(sql).executeUpdate();
	}
	
}
