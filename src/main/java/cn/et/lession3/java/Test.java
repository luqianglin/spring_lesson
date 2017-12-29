package cn.et.lession3.java;


import java.lang.reflect.Proxy;
import java.sql.SQLException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) throws SQLException {
		
		//�����صķ����ⷿ��
		HouseOwner ho = new FHouseOwner();
		//ʵ��������
		HouseProxy hp = new HouseProxy(ho);
		//�н�������
		HouseOwner hproxy = (HouseOwner)Proxy.newProxyInstance(Test.class.getClassLoader(),	
			ho.getClass().getInterfaces(),hp);
		hproxy.seekMyHouse();
	}
	
	
}
