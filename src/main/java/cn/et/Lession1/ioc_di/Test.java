package cn.et.Lession1.ioc_di;

import java.io.ObjectInputStream.GetField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import cn.et.Lession1.A;
import cn.et.Lession1.B;

public class Test {
	public static void main(String[] args) {
		//ÈÝÆ÷¶ÔÏó
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lession1/ioc_di/spring.xml");
		A a=(A)context.getBean("a1");
		System.out.println(a);
		System.out.println(a.getName());
		
		B b=(B)context.getBean("b");
		System.out.println(b.getA().getName());
		
		D d=(D)context.getBean("d");
		System.out.println(d.getB().getA().getName());
		System.out.println(d.getId()+"---"+d.getName());
		
	}
}
