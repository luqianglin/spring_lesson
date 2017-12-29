package cn.et.lession2.anno;

import org.springframework.stereotype.Component;

/**
 * <bean id="a" class="cn.et.lession2.cycle.A" init-method="init" destroy-method="des">	
   </bean>
   
   ע��@Component ��spring�����Զ�ʵ������ǰ��
   id=��������ĸСд
 * @author Administrator
 *
 */
@Component("dd")
public class A {
	private String name;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	/**
	 * ��������bean֮�����
	 */
	public void init(){
		System.out.println("init");
	}
	/**
	 * ��������beanʱ����
	 */
	public void des(){
		System.out.println("des");
	}
}
