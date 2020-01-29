package com.Sneha.apie;

public class AbstractionDemo {

	public static void main(String[] args) {
		
		int pcount = Runtime.getRuntime().availableProcessors();
		
		System.out.println("Available processors "+pcount);
		
		
		
		
		Check c = new Check();
		c.getInfo();
		c.companyName();
		c.livenIn();
	}

}
