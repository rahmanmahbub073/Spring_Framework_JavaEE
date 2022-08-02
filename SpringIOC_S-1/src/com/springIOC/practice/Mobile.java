package com.springIOC.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	// don't need to touch this code we just need to change the bean class 
    //then it will create another ioc object for us
		Sim sim = context.getBean("sim", Sim.class);
		sim.call();
		sim.data();
		
		// This is the ioc logic
//		Airtel air = (Airtel)context.getBean("airtel");
//		air.call();
//		air.data();
//		
//		Grameenphone grameen = (Grameenphone)context.getBean("grameenphone");
//		grameen.call();
//		grameen.data();
		
		//checking for bean loaded or not
//		System.out.println("config loaded");
		
//		Sim sim = new Grameenphone();
//		sim.call();
//		sim.data();
//		
//		Sim Sim = new Airtel();
//		sim.call();
//		sim.data();
		
//		Airtel airtel = new Airtel();
//		airtel.call();
//		airtel.data();
		
//		Grameenphone grameenphone = new Grameenphone();
//		grameenphone.call();
//		grameenphone.data();

	}

}
