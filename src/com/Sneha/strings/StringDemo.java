package com.Sneha.strings;

public class StringDemo {

	public static void main(String[] args) {

		String name="IBM";
		name=name+"Corp";
		
		System.out.println(name);
		
		String myname="Sneha Saha";
		String fullname=new String("Sneha Saha");
		
		System.out.println(myname==fullname); //checking memory location
		
		if(myname.equals(fullname)) //checking content only
				System.out.println("Both are equal");
		else
			System.out.println("Not same");
	}

}
