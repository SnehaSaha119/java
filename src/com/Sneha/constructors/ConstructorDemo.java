package com.Sneha.constructors;

public class ConstructorDemo {
	public static void main(String args[])
	{
		Computer dell = new Computer();
		dell.setManufacture("Dell inc");
		dell.setModel("Latitude");
		dell.setCost(1000);
		
		System.out.println(dell);
		
		Computer ibm = new Computer("IBM corp","Think pad",99000);
		System.out.println(ibm);
	}
	
}

class Computer
{
	@Override //To avoid printing address
	public String toString() {
		return "Computer [manufacture=" + manufacture + ", model=" + model + ", cost=" + cost + "]";
	}
	
	String manufacture;
	String model;
	long cost;
	
	
	
	public Computer() {

	}

	public Computer(String manufacture, String model, long cost) {
		super();
		this.manufacture = manufacture;
		this.model = model;
		this.cost = cost;
	}
	
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	
	
}