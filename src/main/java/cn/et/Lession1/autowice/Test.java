package cn.et.Lession1.autowice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import cn.et.Lession1.B;
public class Test {
	public static void main(String[] args) {
		//��������
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lession1/ioc_di/spring.xml");
		B b =(B)context.getBean("b");
		System.out.println(b.getA().getName());
		
	}
}
