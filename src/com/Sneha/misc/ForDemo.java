package com.Sneha.misc;

import java.util.Iterator;

public class ForDemo {

	public static void main(String[] args) {
	
		for (int i = 0; i < args.length; i++) {
			String string = args[i];
			System.out.println(string);
			
		}
		
		System.out.println("\n---------------------\n");
		for (String string : args) {
			System.out.println(string);
			
		}
	}

}
