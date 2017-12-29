package cn.et.lession3.log;

import java.sql.SQLException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
/**
 * spring实现aop 用了两种技术
 * 	1.java动态代理(面向接口编程)
 * 	2.cglib实现动态代理
 * @author Administrator
 *
 */
public class Test {
	static ConfigurableApplicationContext context;
	static{
		context = new GenericXmlApplicationContext("classpath:cn/et/lession3/log/spring.xml"); 
	}
	public static void main(String[] args) throws SQLException {
		User us=(User)context.getBean("user");

		for (int i = 1; i <=10; i++) {
			us.login();
		}
		us.buy();
		us.buy();
		Admin admin = (Admin)context.getBean("admin");
		admin.addCom();
		admin.addCom();
		admin.addCom();
		
		
	}
	
	
}
