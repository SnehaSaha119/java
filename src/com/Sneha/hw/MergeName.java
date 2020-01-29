package com.Sneha.hw;
import java.util.Scanner;

public class MergeName{

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter the first name :: ");
			String first=sc.next();
			System.out.println("Enter the second name :: ");
			String second=sc.next();
			
			System.out.println("First :: "+first+" Second :: "+second+" Full name :: "+first+" "+second);
			
			System.out.println("Enter exit to discontinue or type no to continue ");
			String ch=sc.next();
			//String ch=sc.nextLine();
			
			if(ch.equals("exit"))
				break;
		
		}
		
		
	}

}