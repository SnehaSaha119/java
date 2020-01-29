package com.Sneha.classes;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		System.out.println("----Employee Application-----");
		
		Employee sneha = new Employee();
		
		sneha.setEmpName("Sneha Saha");
		sneha.setEmpDept("Engg");
		//sneha.setEmpId(123);
		sneha.setProjectName("Sales micro services");
		
		
		
		EmployeeOps crud = new EmployeeOps();
		int empId = crud.createEmployee(sneha);
		System.out.println("Generated Emp Id "+empId);
		
		sneha.setEmpId(empId);
		System.out.println(sneha);
		
	}

}
