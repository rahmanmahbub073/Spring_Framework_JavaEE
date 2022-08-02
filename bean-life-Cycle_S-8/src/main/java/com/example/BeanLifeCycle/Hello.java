package com.example.BeanLifeCycle;

import java.sql.SQLException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
// another way to implementing initializingBean
public class Hello implements InitializingBean, DisposableBean{

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy method inside hello class....");
	}

	public void sample() {
		System.out.println("my codinng start from here....");
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiseSet method inside hello class....");
	}
/*
	// if we have a lot of init and destroy class then we should use this approach
	public void init() {
		System.out.println("init method inside hello class....");
	}
	
	
	public void destroy(){
		
		System.out.println("destroy method inside hello class....");
}
	*/
	
	
}
