package com.Sneha.misc;

public class SuperDemo {

	public static void main(String[] args) {
		ServiceComapny sc=new ServiceComapny();

		
	}

}

class Company
{

	public Company(int value) {
		super(); //refers to object class
		System.out.println("Company constructor");
	}
	
	void info()
	{
		System.out.println("Company.info()");
	}
	
}

class ServiceComapny extends Company
{

	public ServiceComapny() {
		super(100); //refers to parent constructor
	}
	
}
