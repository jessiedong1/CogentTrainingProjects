package com.example.domain;


public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineer eng1 = new Engineer(101, "Jane Smith", "012-34-5678",120_345.27);
		Manager mgr1 = new Manager(201,"Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
		Admin admin = new Admin(304,"Bill Munroe","108-23-6509",75_002.34);
		Director dir = new Director(12,"Susan Wheeler","099-45-2340", 120_567.36,"Global Marketing",1_000_000.00);
		eng1.printEmployee();
		eng1.raiseSalary(1000);
		eng1.setName("Jessie Smith");
		eng1.printEmployee();
		mgr1.printEmployee();
		admin.printEmployee();
		dir.printEmployee();
		  DbConfig config1 = DbConfig.getInstance();
	        DbConfig config2 = DbConfig.getInstance();
	        DbConfig config3 = DbConfig.getInstance();
	        System.out.println(config1);
	        System.out.println(config2);
	        System.out.println(config3);
		
	
	}

}
