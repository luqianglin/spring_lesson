package cn.et.lession2.cycle;


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
