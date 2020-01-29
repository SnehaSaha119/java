package com.Sneha.functions;

public class FinalMethodDemo {
	static final int value = 100;

	public static void main(String[] args) {
		
		System.out.println(value);
		
		//value=200;
		//System.out.println(value);
	}

}

class Data
{
	void stdData()
	{
		System.out.println("Data.stdData()");
	}
	
	final void splData()
	{
		System.out.println("Special data");
	}
	
}

class CompanyData extends Data
{
	@Override
	void stdData() {
		// TODO Auto-generated method stub
		super.stdData();
	}
}