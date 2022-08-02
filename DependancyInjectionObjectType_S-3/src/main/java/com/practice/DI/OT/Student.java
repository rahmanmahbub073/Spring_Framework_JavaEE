package com.practice.DI.OT;

public class Student {
	
	private int id;
	// we have to create object which is in client class
	private MathCheat mathCheat;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	
	//not a way of good programming 
	//MathCheat mathCheat = new MathCheat();
	
	public void cheating() {
		mathCheat.mathcheat();
		System.out.println("This is my id " + id + " and take it from beans");
	}

}
