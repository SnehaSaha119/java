package com.Sneha.variables;

public class VariableDemo {
	
	//variables public, protected, private
	//instance variable
	static int level;
	int level2;

	public static void main(String[] args) {
		
		//local variables
		int count=10;
		System.out.println("Count value : "+count);
		
		System.out.println("Level value : "+level);
	}
	void calculate()
	{
		//System.out.println(count);
		System.out.println(level);
		System.out.println(level2);
	}
}
