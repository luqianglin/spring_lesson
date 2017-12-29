package cn.et.lession2.cycle;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.rmi.server.ObjID;
import java.sql.SQLException;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.management.Query;
import javax.sql.DataSource;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ProtocolResolver;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	static ConfigurableApplicationContext context;
	static{
		context = new GenericXmlApplicationContext("classpath:/cn/et/lession2/cycle/spring.xml"); 
	}
	public static void main(String[] args) throws SQLException {
		
		context.close();
	}
	
	
}
