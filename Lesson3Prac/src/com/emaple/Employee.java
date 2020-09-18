package com.emaple;

public abstract class Employee {

	private final int id;
	private String name;
	protected double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
//	public Employee() {
//		this(0, "", 0.0);
//	
//	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void changeName(String newname) {
		if(newname != null) {
			name=newname;
		}
	}
	public double getSalary() {
		return salary;
	}
	public void raiseSalary(double amount) {
		//other logics
		this.salary += amount;
	}
	
	public String toString() {
		return id + ": " +name +": " + salary;
	}
	
	//static is not allowed to use this, cannot use class variable; cannot override; the instance cannot override the static 
	public static void display() {
		System.out.println("1");
	}
	
	
}
