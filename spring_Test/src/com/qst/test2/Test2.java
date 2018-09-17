package com.qst.test2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {


	
	public static void main(String[] args) {
		AbstractApplicationContext  ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User)ctx.getBean("user1");
		user.setName("xxx");
		user.setName("ss");
		user.getRole().setName("管理");
		System.out.println(user);
		
		ctx.close();


	}

	
	

}
