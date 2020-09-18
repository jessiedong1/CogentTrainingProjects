package com.example.domain;

import java.text.NumberFormat;

public class Employee {
	private int empId;
	private String name;
	private String ssn;
	private double salary;
	
	public Employee(int empId, String name, String ssn, double salary) {
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	public double getSalary() {
		return salary;
	}

	public void setName(String name) {
		if(name != null) {
		this.name = name;
		}
		else {
			System.out.println("Please enter a valid name");
		}
	}
	public void raiseSalary(double increase) {
		if (increase >= 0) {
		salary += increase;
		}
		else {
			System.out.println("The increase salary cannot be negetive!");
		}
	}
	public void printEmployee() {
		System.out.println("ID: " +getEmpId());
		System.out.println("Name: " +getName());
		System.out.println("SSN: " +getSsn());
		System.out.println("Salary: " +NumberFormat.getCurrencyInstance().format((double)
				getSalary()));
		
	}
}
