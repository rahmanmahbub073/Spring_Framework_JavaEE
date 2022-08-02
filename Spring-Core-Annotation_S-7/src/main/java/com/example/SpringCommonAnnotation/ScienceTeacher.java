package com.example.SpringCommonAnnotation;

import org.springframework.stereotype.Component;

//we comment out some program in CollegeConfig class (reason-1) thats why we use @component
//It is another way to creating object instead of reason-1.

//It will create object for us but it doesnt inject if don't write autowired annotation
@Component
public class ScienceTeacher implements Teacher {

	public void teach() {
		// TODO Auto-generated method stub
		
		System.out.println("Hi, I'm your Science teacher");
		System.out.println("My Name is saima rahman");

	}

}
