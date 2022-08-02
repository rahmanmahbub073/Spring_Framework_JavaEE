package com.example.SpringCommonAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		//If  we use beans.xml,  we should use it
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//System.out.println("Beans.xml loaded");
	/*	
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		
		//here insetead of "colBean" We can use CollegeBean if use @Bean
		// College method in CollegeConfig class
		College college = context.getBean("collegeBean", College.class);
		System.out.println("The College object Created by Spring is : " + college);
		college.test();
		
		((AnnotationConfigApplicationContext)context).close();
		*/
		
		//or we can use class reference
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		
		//here insetead of "colBean" We can use CollegeBean if use @Bean
		// College method in CollegeConfig class
		College college = context.getBean("college", College.class);
		System.out.println("The College object Created by Spring is : " + college);
		college.test();
		context.close();
	}

}
