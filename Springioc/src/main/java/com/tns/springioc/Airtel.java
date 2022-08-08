package com.tns.springioc;

public class Airtel implements Sim{
	
	public Airtel()  //if constructor is called it means objects are created
	{
		System.out.println("Airtel Constructor is called...");
	}
	public void calling() {
		System.out.println("Calling using airtel sim...!");		
	}

	public void data() {
		System.out.println("Browsing using airtel sim...!");	
	}

}
