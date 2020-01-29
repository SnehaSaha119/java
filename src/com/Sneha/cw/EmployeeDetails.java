package com.Sneha.cw;
import java.util.Scanner;

public class EmployeeDetails {
	
	String empName;
	int empId;
	String dept;
	String project;
	int total;
	EmployeeDetails()
	{
		
	}
	
	EmployeeDetails(String a,int b,String c,String d)
	{
		empName=a;
		empId=b;
		dept=c;
		project=d;
		
	}
	
	void process()
	{
		Scanner sc=new Scanner(System.in);
		
		int i,j,ch,chh;
		i=0;
		String a,c,d;
		int b,e;
		
		System.out.println("Enter total number of employees : ");
		total=sc.nextInt();
		EmployeeDetails[] obj=new EmployeeDetails[total];
		
		//EmployeeDetails[] obj=new EmployeeDetails[10];
		do
		{
			System.out.println("1.Create 2.retrieve 3.Update 4.Delete 5.Exit ");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("Enter employee name :: ");
					a=sc.next();
					System.out.println("Enter employee id :: ");
					b=sc.nextInt();
					System.out.println("Enter department name :: ");
					c=sc.next();
					System.out.println("Enter project name :: ");
					d=sc.next();
					obj[i]=new EmployeeDetails(a,b,c,d);
					System.out.println(obj[i]);
					i++;
					break;
				case 2:
					System.out.println("Enter employee id :: ");
					e=sc.nextInt();
					
					for(j=0;j<i;j++)
					{
						int f=obj[j].empId;
						if(f==e)
						{
							System.out.println(obj[j]);
							break;
						}
					}
					
					if(j==i)
						System.out.println("Not found");
					break;
				case 3:
					System.out.println("Enter employee id :: ");
					e=sc.nextInt();
					
					for(j=0;j<i;j++)
					{
						int f=obj[j].empId;
						if(f==e)
						{
							System.out.println(obj[j]);
							System.out.println("1.Department 2.Project");
							chh=sc.nextInt();
							
							switch(chh)
							{
							
							case 1:
								System.out.println("Enter updated dept : ");
								c=sc.next();
								obj[j].dept=c;
								break;
							case 2:
								System.out.println("Enter updated project : ");
								d=sc.next();
								obj[j].project=d;
								break;
							default:
								System.out.println("Wrong choice");
							}
						}
						break;
					}
					if(j==i)
						System.out.println("Not found");
					break;
				case 4:
					System.out.println("Enter employee id :: ");
					e=sc.nextInt();
					
					for(j=0;j<i;j++)
					{
						int f=obj[j].empId;
						if(f==e)
						{
							int k=j;
							
							while(k<(i-1))
							{
								obj[k]=obj[k+1];
								k++;
							}
						}
					}
					i--;
					System.out.println("Successful deletion");
					for(j=0;j<i;j++)
					{
						System.out.println(obj[j]);
					}
					
				case 5:
					break;
				default:
					System.out.println("Wrong choice");
				
			}
		}while(ch!=5);
	}

	public static void main(String[] args) {
		
		EmployeeDetails o=new EmployeeDetails();
		
		o.process();
		
	}

	@Override
	public String toString() {
		return "EmployeeDetails [empName=" + empName + ", empId=" + empId + ", dept=" + dept + ", project=" + project
				+ "]";
	}

	
	
	
}
