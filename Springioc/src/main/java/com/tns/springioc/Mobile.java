package com.tns.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config loaded...!");
		
		Sim s = c.getBean("sim",Sim.class); //generalization
		s.calling();
		s.data();
		
		//Airtel a=new Airtel(); // creating objects in core java is like this
		//a.calling();
		//a.data();
		
		//Jio j=new Jio();
		//j.calling();
		//j.data();
		
		
		
	
	}

}
