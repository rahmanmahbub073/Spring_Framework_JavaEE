package com.practice.DependancyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		
		/*
		 * //constructor based injection by spring container ApplicationContext context
		 * = new ClassPathXmlApplicationContext("beans.xml"); Student object =
		 * context.getBean("student", Student.class); object.displayStudentInfo();
		 */
		
		//constructor injection by hard coding
		//Student sai = new Student(1, "Hello Spring");
		//sai.displayStudentInfo();
		
		
		//we initialized it in beans property
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student object  = context.getBean("student", Student.class);
		object.displayStudentInfo();
		
		//checking new object creating or not which has been initialized in Beans
		Student saima = context.getBean("saima", Student.class);
		saima.displayStudentInfo();
		
		//we will use spring ioc container
		// if we run this, we will get null output. cause "studentName" is null by default
		//in Student class 
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 * Student object = context.getBean("student", Student.class);
		 * object.displayStudentInfo();
		 */
		
		
		//This is hard coding we don't wanna use it
		/*
		 * Student student = new Student();
		 * 
		 * // Here "Mahbubur Rahman" is call injection //
		 * student.setStudentName("Mahbubur Rahman"); //it won't work because we make
		 * student name "private" in Student //student.studentName = "Mahbub";
		 * 
		 * student.displayStudentInfo();
		 */
	}
	

}
