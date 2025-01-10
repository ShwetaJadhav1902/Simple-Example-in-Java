package com.employee;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int id) {
		employeeId=id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
    public void setEmployeeName(String name) {
    	employeeName=name;
    }
    public double getEmployeeSalary() {
    	return employeeSalary;
    }
    public void setEmployeeSalary(double salary) {
    	employeeSalary=salary;
    }

}
