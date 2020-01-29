package com.Sneha.strings;

public class StringBuilderDemo {

	public static void main(String[] args) {

		String name="Sneha";
		name=name+"Saha";
		
		StringBuffer s=new StringBuffer();
		s.append("IBM");
		s.append("Lab");
		
		StringBuilder sb=new StringBuilder(); //Same memory location modification
		sb.append("Sneha");
		System.out.println(sb);
		sb.append("Saha");
		System.out.println(sb);
	}

}
