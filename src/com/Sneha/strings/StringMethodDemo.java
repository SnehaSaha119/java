package com.Sneha.strings;

public class StringMethodDemo {

	public static void main(String[] args) {

		String name="IBM Cloud India";
		
		System.out.println(name.indexOf("C"));
		
		System.out.println(name.substring(4,9));
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.replace(" ","_"));
		
		System.out.println(name.contains("labs"));
	}

}
