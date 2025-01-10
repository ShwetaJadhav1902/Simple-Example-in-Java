package com.employee;


public class MainEmployee {
	public static void main(String[] args) {
		Employee e=new Employee();
		
		e.setEmployeeId(101);
		e.setEmployeeName("shweta");
		e.setEmployeeSalary(210000);
		
		int id=e.getEmployeeId();
		System.out.println("EmployeeId:"+id);
		String name=e.getEmployeeName();
		System.out.println("EmployeeName:"+name);
		double Salary=e.getEmployeeSalary();
		System.out.println("EmployeeSalary:"+Salary);
	}

}
