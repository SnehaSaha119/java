package com.Sneha.misc;

public class ObjectDemo {

	public static void main(String[] args) {

		Mobile m=new Mobile();
		m.getType();
		m.screensize();
		m.toString();
		
		Object mob=new Mobile();
		Keyboard mobkey=new Mobile();
	}

}
class Mobile extends Keyboard
{
	void screensize()
	{
	
	}
}
class Keyboard
{
	void getType()
	{
		
	}
}