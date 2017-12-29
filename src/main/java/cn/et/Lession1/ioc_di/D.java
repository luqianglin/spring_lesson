package cn.et.Lession1.ioc_di;

import cn.et.Lession1.B;

public class D {
	private String id;
	private String name;
	private B b;
	public D(String id, String name, B b) {
		super();
		this.id = id;
		this.name = name;
		this.b = b;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public B getB() {
		return b;
	}
	
	
}
