package com.Sneha.functions;

public class FinalClassDemo {

	public static void main(String[] args) {
		
		AdditionalInfo ai = new AdditionalInfo();
		ai.getInfo();

	}

}
final class Info
{
	void getInfo()
	{
		System.out.println("Info.getInfo()");
	}
	
}
class AdditionalInfo
{
	void getInfo() //in place of overriding parent class getInfo() when we use final
	{
		Info i = new Info();
		i.getInfo();
	}
	
}