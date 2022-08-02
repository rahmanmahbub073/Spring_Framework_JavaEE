package com.example.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		//inner base dependency injection or object passing from bean by using ioc container
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//tracking bean
		System.out.println("beans xml file loaded....");
		Student student = context.getBean("student", Student.class);
		student.cheating();
		

		AnotherStudent anotherStudent = context.getBean("anotherStudent", AnotherStudent.class);
		anotherStudent.anotherCheating();
	}

}
