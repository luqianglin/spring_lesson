package cn.et.lession3.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ʵ�ִ�����
 * @author Administrator
 *
 */
public class HouseProxy implements InvocationHandler {
	/**
	 * ������
	 */
	HouseOwner house;
	public HouseProxy(HouseOwner house) {
		this.house=house;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("�����");
		System.out.println("���");
		//ǰ��֪ͨ
		
		//Ŀ����� ����
		Object obj=null;
		try {
			 obj= method.invoke(house,args);
			 //����֪ͨ
		} catch (Exception e) {
			//�쳣֪ͨ
			e.printStackTrace();
		}
		//����֪ͨ
		System.out.println("��Ͱ��");
		return obj;
	}

}