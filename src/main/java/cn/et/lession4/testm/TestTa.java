package cn.et.lession4.testm;

import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import cn.et.lession4.testm.dao.AcDaoImpl;


public class TestTa {
	
	static AcDaoImpl acDaoImpl;
	static{
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lession4/testm/spring.xml");
		acDaoImpl=(AcDaoImpl)context.getBean("acDaoImpl");
	}
	public static void main(String[] args) throws Exception {
		acDaoImpl.updateAminus(10);
		
	}

}
