package com.Sneha.strings;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		String name=args[0];
		System.out.println(name);
		
		System.out.println("---------------");
		
		String[] names=name.split(" ");
		System.out.println(Arrays.asList(names));
		
		System.out.println("---------------");
		
		for (String string : names) {
			System.out.println(string);
			
		}
		
		System.out.println("---------------");
		
		StringTokenizer n=new StringTokenizer(name," ");
		while(n.hasMoreTokens())
		{
			System.out.println(n.nextToken());
		}
		
	}

}
