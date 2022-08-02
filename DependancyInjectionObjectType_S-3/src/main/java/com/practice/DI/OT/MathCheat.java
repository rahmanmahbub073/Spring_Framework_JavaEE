package com.practice.DI.OT;

public class MathCheat {
	
	public MathCheat() {
		//tracker
		//it shows output two times because we creat this object two times in Student and AnotherStudent class
		//if want to light weight apk we have to do something in beans
		System.out.println("MathCheat Class constructor tracker");
	}
	
	public void mathcheat() {
		System.out.println("Math Cheating started...");
	}

}
