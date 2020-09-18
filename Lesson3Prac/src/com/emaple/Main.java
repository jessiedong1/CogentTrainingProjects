package com.emaple;

import com.emaple.demo.Clerk;
import com.emaple.demo.Manager;

public class Main {
	public static void show(Employee obj) {
		if(obj instanceof Manager)
		{
			Manager m = (Manager)obj;
			m.setDeptName("Cloud");
		}
		System.out.println(obj);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee e1 = new Employee(123, "Jessie", 1200);
		
		//hibernate
		Manager m1 = new Manager(1234, "Ben", 1000, "Product Manager");
		Manager m2 = new Manager(1234, "Jamin", 1000, "AWS Cloud");
		Clerk clk1 = new Clerk(1256,"Peter", 999,"Click2Run");
//		
//		show(m1);
//		show(clk1);
		
	}

}
