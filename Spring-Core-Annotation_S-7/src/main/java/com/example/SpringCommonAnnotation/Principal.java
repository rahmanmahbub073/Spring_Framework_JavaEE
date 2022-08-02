package com.example.SpringCommonAnnotation;

import org.springframework.stereotype.Component;

//It will create object for us but it doesnt inject if don't write autowired annotation
@Component
public class Principal {
	
	public void principalInfo() {
		System.out.println("I am our principal.");
		System.out.println("My name is Mahbub");
	}

}
