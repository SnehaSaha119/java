package com.Sneha.cw;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.Sneha.cw.Company;
import com.Sneha.cw.CompanyComparator;

public class CompanyDetails {

	public static void main(String[] args) {
		
		int ch,a,e,f,chh;
		String b,c,d;
		
		Scanner sc=new Scanner(System.in);
		
		TreeSet<Company> companySet=new TreeSet<>(new CompanyComparator()); //different class
		
		
		do
		{
			System.out.println("1.Create 2.retrieve 3.Update 4.Delete 5.Exit ");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("Enter company id :: ");
					a=sc.nextInt();
					System.out.println("Enter company name :: ");
					b=sc.next();
					System.out.println("Enter company location :: ");
					c=sc.next();
					System.out.println("Enter company founder :: ");
					d=sc.next();
					
					companySet.add(new Company(a,b,c,d));
					break;
				case 2:
					System.out.println("Enter company id :: ");
					e=sc.nextInt();
					boolean exist = false;
					for (Company company : companySet)
					{
						f=company.getId();
						if(f==e)
						{
							System.out.println(company);
							exist = true;
						}
						
					}
					
					if(exist==false)
						System.out.println("Does not exit");
					break;
				case 3:
					System.out.println("Enter company id :: ");
					e=sc.nextInt();
					boolean exists=false;
					
					for (Company company : companySet)
					{
						f=company.getId();
						if(f==e)
						{
							exists=true;
							System.out.println(company);
							System.out.println("1.Location 2.Founder");
							chh=sc.nextInt();
							
							switch(chh)
							{
							
							case 1:
								System.out.println("Enter updated location : ");
								c=sc.next();
								company.setLocation(c);
								System.out.println(company);
								break;
							case 2:
								System.out.println("Enter updated founder : ");
								d=sc.next();
								company.setFounder(d);
								System.out.println(company);
								break;
							default:
								System.out.println("Wrong choice");
							}
							break;
						}
					}
					if(exists==false)
						System.out.println("Does not exits");
					break;
				case 4:
					System.out.println("Enter company id :: ");
					e=sc.nextInt();
					for (Company company : companySet)
					{
						f=company.getId();
						if(f==e)
						{
							companySet.remove(company);
							break;
						}
					}
					System.out.println(companySet);
					break;
				case 5:
					break;
				default:
					System.out.println("Wrong choice");
				
			}
		}while(ch!=5);
	}

}

class CompanyComparator implements Comparator<Company>
{

	@Override
	public int compare(Company com1, Company com2) {
		
		return com1.getLocation().compareTo(com2.getLocation());
	}
	
}
class Company
{
	int id;
	String name;
	String location;
	String founder;
	
	public Company(int id, String name, String location, String founder) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.founder = founder;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}


	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", location=" + location + ", founder=" + founder + "]";
	}

	

}