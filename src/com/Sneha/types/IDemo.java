package com.Sneha.types;

public class IDemo {

	public static void main(String[] args) {
		HPPrinter hp = new HPPrinter();
		System.out.println(hp.canPrintPhotos());
		
		CannonPrinter canon = new CannonPrinter();
		System.out.println(canon.canPrintPhotos());
		
		Printable p= new CannonPrinter(); //parent reference and can pass any child reference
		p = new HPPrinter();
		
		Printable another = new Printable() { //anonymous class i.e. class without name so this portion is created at that time after use it get deleted bcz no name class is created
			//actually printable is interface so an anonymous class is created
			@Override
			public boolean canPrintPhotos() {
				System.out.println("IDemo.main(...).new Printable() {...}.canPrintPhotos()");
				return false;
			}
		};
		System.out.println(another.canPrintPhotos());
	}

}
