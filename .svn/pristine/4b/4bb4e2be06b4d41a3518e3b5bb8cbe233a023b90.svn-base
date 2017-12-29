package cn.et.Lession1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.instrument.classloading.weblogic.WebLogicLoadTimeWeaver;
/**
 * FileSystemXmlApplicationContext 从文件系统寻找xml文件 带盘符
 * ClassPathXmlApplicationContext 从类路径下寻找  常用使用
 * GenericXmlApplicationContext 通用默认查找类路径
 * WebApplicationtext web.xml中实例化
 * 
 * 就近原则 所有ApplicationContext指令 都支持字符串定义查找方式
 * 		classpath;
 * 		file;
 * @author Administrator
 *
 */
public class TestCotainer {
	public static void main(String[] args) {
		//容器对象
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lession1/spring.xml");
		A a=(A)context.getBean("a");
		A b=(A)context.getBean("b");
		System.out.println(a==b);
		
		//B。类只能有一个
//		B b1=context.getBean(B.class);
//		System.out.println(b1);
		
		//B字符串类默认取第一个
		B b2 =(B)context.getBean("cn.et.Lession1.B");
		System.out.println(b2);
		
		//如果没有指定id的类  默认的名字 是类名#编号
		String[] str = context.getBeanDefinitionNames();
		for(String tmp:str){
			System.out.println(tmp);
		}
		
	}
}
