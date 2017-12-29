package cn.et.lession2.mvc;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import cn.et.lession2.mvc.controller.MyController;

public class MyView {
	static ConfigurableApplicationContext context;
	static{
		context = new GenericXmlApplicationContext("classpath:/cn/et/lession2/mvc/spring.xml"); 
	}
	
	private static MyController cont;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			while(true){
				System.out.print("������sql���");
				String sql=sc.nextLine();
				cont=(MyController)context.getBean("myController");
				
				cont.service(sql);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			context.close();
		}
	} 
}
