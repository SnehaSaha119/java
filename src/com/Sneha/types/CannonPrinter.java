package com.Sneha.types;

public class CannonPrinter implements Printable{

	@Override
	public boolean canPrintPhotos() {
		System.out.println("CannonPrinter.canPrintPhotos()");
		return false;
	}
	
}
