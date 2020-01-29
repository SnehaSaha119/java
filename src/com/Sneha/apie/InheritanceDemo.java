package com.Sneha.apie;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Calc cal = new Calc();
		cal.add(20, 30);
		
	}

}

class Calc extends Stdcalculation
{
	
}

class Stdcalculation extends Scicalculation
{
	void add(int firstvalue,int secondvalue)
	{
		System.out.println("Std sum : " + (firstvalue + secondvalue));
	}
}

class Scicalculation
{
	void add(int firstvalue,int secondvalue)
	{
		System.out.println("Sci sum : " + (firstvalue + firstvalue + secondvalue));
	}
}