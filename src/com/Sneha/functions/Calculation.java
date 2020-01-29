package com.Sneha.functions;

public abstract class Calculation {
	
	public static int addition(int first, int last)
	{
		return first+last;
	}
	
	protected final int subtraction(int first, int last)
	{
		return first-last;
	}
	
	synchronized int multiplication(int first, int last)
	{
		return first*last;
	}
	
	private native int division(int first, int last)
	{
		return first/last;
	}
	
	abstract int remaining(int first, int last);

}
