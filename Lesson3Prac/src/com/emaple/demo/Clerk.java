package com.emaple.demo;

import com.emaple.Employee;

//If there is no constructor written by us, default constructor will be supplied by the compiler into byte code
//default constructor
//public Manager() {
//	super();
//}
public class Clerk extends Employee {
	private String projectName;
	
	public Clerk(int id, String name, double salary, String deptName){
		super(id, name, salary);
		this.projectName = deptName;
	}
	public String getDeptName() {
		return projectName;
	}

	public void setDeptName(String deptName) {
		this.projectName = deptName;
	}
	
	public String toString() {
		return super.toString()+ " :" + projectName;
	}
	
	public void raiseSalary(double amount) {
		this.salary *= (1+ amount/100);
	}
	
	
}
