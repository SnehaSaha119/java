package com.Sneha.types;

public class InterfaceExtDemo {

	public static void main(String[] args) {
		
		Validate v=new Validate();
		v.validation();

	}

}

class Validate implements HardwareValidation, SoftwareValidation
{

	@Override
	public boolean validation() {
		System.out.println("Validate.validation()");
		return false;
	}
	
}

interface HardwareValidation
{
	boolean validation();
}

interface SoftwareValidation
{
	boolean validation();
}