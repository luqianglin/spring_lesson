package cn.et.lession4.jdbc;

import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import cn.et.lession4.jdbc.dao.MyMoneyDao;
/**
 * 编程式事务
 * 声明式事务
 * 	 xml声明(全局)
 * 	注解声明
 * @author Administrator
 *
 */
public class TestTa {
	
	static MyMoneyDao myMoneyDao;
	static{
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lession4/jdbc/spring.xml");
		myMoneyDao=(MyMoneyDao)context.getBean("myMoneyDaoImpl");
	}
	public static void main(String[] args) throws SQLException {
		myMoneyDao.updateAminus(10);
		int i=2/0;
		myMoneyDao.updateBadd(10);
	}

}
