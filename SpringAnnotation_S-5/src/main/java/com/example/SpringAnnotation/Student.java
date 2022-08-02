package com.example.SpringAnnotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	// Required is allowed in this field
	@Value("${student.name}") // another method for dynamic loading in java based
	//@Value("Mahmuda Akter")
	private String name;
	
	@Value("${student.interestedCourse}") // another method for dynamic loading in java based
	//@Value("English")
	private String interestedCourse;
	
	@Value("${student.hobby}") // another method for dynamic loading in java based
	//@Value("Sleeping")
	private String hobby;
	
	// we can use annotation if don't use dynamic method in xml
	
	//@Reuired
	//@Value("${student.name}") // another method for dynamic loading in java based
	//@Value("Mahmuda Akter")
	public void setName(String name) {
		this.name = name;
		System.out.println("SetName Called");
	}
	
	//@Required
	//@Value("${student.interestedCourse}") // another method for dynamic loading in java based
	//@Value("English")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
		System.out.println("setInterestedCourse Called");
	}
	//@Required
	//@Value("${student.hobby}") // another method for dynamic loading in java based
	//@Value("Sleeping")
	public void setHobby(String hobby) {
		this.hobby = hobby;
		System.out.println("setHobby Called");
	}
	
	public void displayStudentInfo() {
		System.out.println("Student name " + name);
		System.out.println("Student interested course " + interestedCourse);
		System.out.println("Student hobby " + hobby);
		
	}

}
