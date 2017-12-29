package cn.et.Lession1.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import cn.et.Lession1.prototype.A;

public class Test {
	public static void main(String[] args) {
		//ÈÝÆ÷¶ÔÏó
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lession1/prototype/spring.xml");
		A a =(A)context.getBean("a");
		A a1 =(A)context.getBean("a");;
		System.out.println(a==a1);
		
		
	}
}
