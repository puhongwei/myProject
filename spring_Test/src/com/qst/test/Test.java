package com.qst.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qst.model.User;

public class Test {

	public static void main(String[] args) {

		/*User user = new User();
		user.setName("zhangsan");
		System.out.println(user.getName());*/
		
		AbstractApplicationContext  ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("--------------------");
		User user1 = (User)ctx.getBean("userx");
		/*Role role = (Role)ctx.getBean("role");
		user1.setRole(role);*/
		/*
		User user2 = (User)ctx.getBean("user");
		user2.setName("xxx");
		System.out.println(user1==user2);*/
		System.out.println(user1);
		//System.out.println(user2);
		
		ctx.close();
	}

}
