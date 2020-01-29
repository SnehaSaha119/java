package com.Sneha.types;

public class HPPrinter implements Printable {

	@Override
	public boolean canPrintPhotos() {
		System.out.println("HPPrinter.canPrintPhotos()");
		return true;
	}

}
