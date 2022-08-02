package com.example.SpringCommonAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//we comment out some program in CollegeConfig class (reason-1) thats why we use @component
//It is another way to creating object instead of reason-1.

//It will create object for us but it doesnt inject if don't write autowired annotation
@Component
//@Primary // now it run this as a primary, we comment it out for testing @qualifier
public class MathTeacher implements Teacher {

	public void teach() {
		// TODO Auto-generated method stub
		
		System.out.println("Hi, I'm your Math teacher");
		System.out.println("My Name is Jhon Don");

	}

}
