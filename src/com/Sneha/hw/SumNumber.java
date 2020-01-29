package com.Sneha.hw;
import java.io.IOException;
import java.util.Scanner;

public class SumNumber{

			public static void main(String[] args)throws IOException {
				
				
				
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				
				while(true)
				{
				
					
					System.out.println("Enter the first number ::");
					while (!sc.hasNextInt()) 
					{
				        System.out.println("Not a number enter again!");
				        sc.next();
					}
					int a=sc.nextInt();
					
					System.out.println("Enter the second number ::");
					while (!sc.hasNextInt()) 
					{
				        System.out.println("Not a number enter again");
				        sc.next();
					}
					int b=sc.nextInt();
					
					System.out.println("Sum :: "+(a+b));
					
					System.out.println("Enter exit to discontinue or type no to continue ");
					String ch=sc.next();
					//String ch=sc.nextLine();
					
					if(ch.equals("exit"))
						break;
				
				}

			}
}
