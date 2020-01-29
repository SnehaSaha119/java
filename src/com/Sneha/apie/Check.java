package com.Sneha.apie;

public class Check //public-to access from other package
{
	int count;
	String name;
	
	void getInfo() //package-same package any class
	{
		personalInfo();
		System.out.println("Sneha S");
	}
	
	public void livenIn() //public-any package
	{
		System.out.println("Bangalore, India");
	}
	
	protected String companyName() 
	{
		//personalInfo(); //To avoid warning in personalInfo
		return "IBM Corporation";
	}
	
	private void personalInfo()
	{
		System.out.println("Sneha Saha, Bangalore, India ");
	}
	
}

