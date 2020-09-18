package com.emaple.demo;

import com.emaple.Employee;

//If there is no constructor written by us, default constructor will be supplied by the compiler into byte code
//default constructor
//public Manager() {
//	super();
//}
public class Manager extends Employee {
	private String deptName;
	
	public Manager(int id, String name, double salary, String deptName){
		super(id, name, salary);
		this.deptName = deptName;
	}
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public String toString() {
		return super.toString()+ " :" + deptName;
	}
	public void raiseSalary(double amount) {
		this.salary += amount;
	}
	
	
	
}
