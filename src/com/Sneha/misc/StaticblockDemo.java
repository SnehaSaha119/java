package com.Sneha.misc;

public class StaticblockDemo {

	public static void main(String[] args) {
		
		new Check();
		/*Check c=new Check();
		Check c1=new Check();
		Check c2=new Check();*/
			
	}

}

class Check
{
	static
	{
		System.out.println("Static block");
	}
	{
		System.out.println("Instance block");
	}

	public Check() {
		System.out.println("Check.Check()");

	}
	
}