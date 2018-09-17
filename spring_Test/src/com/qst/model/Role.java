package com.qst.model;

public class Role {

	private int id;
	private String name;
	
	
	public Role() {
		System.out.println("Role构造方法调用");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Role [name=" + name + "]";
	}
	
	
}
