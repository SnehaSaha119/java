package com.Sneha.misc;

public class ThisDemo {

	private int count;
	public static void main(String[] args) {
		
		ThisDemo td = new ThisDemo();
		td.process();
	}
	
	void process() 
	{
		
		System.out.println("Count value "+count);
		setCount(123);
		System.out.println("Updated count :"+count);
	}
	private void setCount(int count)
	{
		this.count=count;
	}

}
