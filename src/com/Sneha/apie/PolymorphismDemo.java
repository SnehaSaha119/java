package com.Sneha.apie;

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		InterestCalc ic = new CompoundInterestCalc(); //reference of parent and object of child
		
		ic.calculate(100);
		//ic.calculate("Sneha");
		
	}

}

class CompoundInterestCalc extends InterestCalc
{
	@Override
	void calculate(int principle) {
		System.out.println("CompoundInterestCalc.calculate()");
	}
}

class InterestCalc
{
	void calculate(int principle) {
		
		System.out.println("InterestCalc.calculate()");
		
	}
	
	/*void calculate(String name) {
		System.out.println("InterestCalc.calculate(string)");
		
	}*/
}