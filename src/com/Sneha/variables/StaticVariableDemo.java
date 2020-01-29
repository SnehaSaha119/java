package com.Sneha.variables;

public class StaticVariableDemo {

	public static void main(String[] args) {
		
		Vendor iiht=new Vendor();
		iiht.createVendor("IIHT technologies");
		iiht.totalVendor();
		
		Vendor hungerBox = new Vendor();
		hungerBox.createVendor("HungerBox food Service");
		hungerBox.totalVendor();
		
		Vendor srs = new Vendor();
		srs.createVendor("HungerBox food Service");
		srs.totalVendor();
		
	}

}
class Vendor
{
	static int totalVendors;
	
	void createVendor(String name)
	{
		System.out.println("reate a vendor !!"+name);
		totalVendors ++;
	}
	
	void totalVendor()
	{
		System.out.println("No of vendors : "+totalVendors);
	}
}