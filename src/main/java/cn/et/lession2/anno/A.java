package cn.et.lession2.anno;

import org.springframework.stereotype.Component;

/**
 * <bean id="a" class="cn.et.lession2.cycle.A" init-method="init" destroy-method="des">	
   </bean>
   
   注解@Component 让spring容器自动实例化当前类
   id=累吗首字母小写
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
	 * 容器创建bean之后调用
	 */
	public void init(){
		System.out.println("init");
	}
	/**
	 * 容器销毁bean时调用
	 */
	public void des(){
		System.out.println("des");
	}
}
