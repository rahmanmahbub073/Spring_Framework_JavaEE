package com.example.loose.coupling;

public class Student {
	
	// we have to create object which is in client class
	private Cheat cheat;
	
	
	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}

	public void cheating() {
		cheat.cheat();
		
	}

}
