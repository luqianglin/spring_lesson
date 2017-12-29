package cn.et.lession2.anno;

import java.sql.SQLException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	static ConfigurableApplicationContext context;
	static{
		context = new GenericXmlApplicationContext("classpath:/cn/et/lession2/anno/spring.xml"); 
	}
	public static void main(String[] args) throws SQLException {
		A a=(A)context.getBean("dd");
		System.out.println(a);
		context.close();
	}
	
	
}
