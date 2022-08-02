package com.practice.DependancyInjection;

public class Student {
	
	private int id;
	private String studentName;

	/*
	 * //dependency injection by constructor public Student(int id, String
	 * studentName) {
	 * 
	 * this.id = id; this.studentName = studentName; }
	 */
	
	
	//dependency injection by set method
	public void setId(int id) {
		this.id = id;
	}

	//if make it secure (private) it wont work in Exam class
	// Here "studentName" is call dependency

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void displayStudentInfo() {
		System.out.println("Student name is " + studentName
				            + " and Id number is: " + id);
	}
	

}
