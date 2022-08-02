package com.example.SpringCommonAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// we can use this two annotation instead of beans.xml
@Configuration 
@ComponentScan(basePackages = "com.example.SpringCommonAnnotation")
public class CollegeConfig {
	
/*  reason-1
    // we commented this for using annotation in class like component
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
	// interface Teacher
	@Bean
	public Teacher mathTeacherBean() {
		
		// we can not create object for interface like Principal
		return new MathTeacher();
	}
	
	@Bean
	public College collegeBean() { //collegeBean - bean id
		
		//College college = new College(principalBean()); // using constructor method only
		College college = new College();
		college.setPrincipal(principalBean()); // using setter method
		college.setTeacher(mathTeacherBean());
		return college;
	}
*/

	//This is another way to create college Bean without using @Component
	//annotation in College class. and we dont need @ComponentScan annotatio
	
	//@Bean(name = "colBean")
	//@Bean(name = {"colBean","collegebean"}) //we can also defined id in here 
/*	@Bean
	public College collegeBean() { //collegeBean - bean id
		
		College college = new College();
		return college;
		
		// another way
		//return new College();
	}
*/

}
