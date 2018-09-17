package com.qst.model;

import java.util.List;
import java.util.Map;

public class User {

	private String name;
	private String password;
	private int age;
	
	private Role role;
	
	private List list;
	private Map map;
	
	public User(){
		System.out.println("构造方法调用");
		
	}

	public User(String name, String password, int age,Role role) {
		this.name = name;
		this.password = password;
		this.age = age;
		this.role = role;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age + ", role=" + role + ", list=" + list
				+ ", map=" + map + "]";
	}

	
	
	
	public void init(){
		System.out.println("init.....");
		this.setPassword("555");
	}
	
	public void destory(){
		System.out.println("destory.....");
	}
	
	
}
