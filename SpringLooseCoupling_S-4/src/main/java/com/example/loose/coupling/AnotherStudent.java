package com.example.loose.coupling;

public class AnotherStudent {
	
	private Cheat cheat;
	
	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}

	public void anotherCheating() {
		cheat.cheat();
	}

}
