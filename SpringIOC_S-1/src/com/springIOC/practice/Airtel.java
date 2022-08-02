package com.springIOC.practice;

public class Airtel implements Sim{
	
	//checking for creating object or not
//	public Airtel() {
//		System.out.println("airtel constructor called");
//	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Calling using Airtel mobile");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("browsing using Airtel mobile");
	}
	

}
