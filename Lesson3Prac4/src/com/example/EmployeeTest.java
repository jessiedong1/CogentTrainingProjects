package com.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.business.EmployeeStockPlan;
import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Manager;

public class EmployeeTest {
	public static void printEmployee(Employee emp) {
		System.out.println("Employee type: " + emp.getClass().getSimpleName());
		System.out.println(emp);
	}
	
	public static void printEmployee(Employee emp, EmployeeStockPlan esp) {

		System.out.println("Employee type: " + emp.getClass().getSimpleName());
		System.out.println(emp);
		System.out.println("Stock Options:	"+esp.grantStock(emp));
	}

	
    public static void main(String[] args) {

        // Create the classes as per the practice
        Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);

        Manager mgr = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");

        Admin adm = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);

        Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
//        EmployeeStockPlan esp = new EmployeeStockPlan(); 
//        System.out.println(eng);
//        System.out.println(adm);
//        System.out.println(mgr);
//        System.out.println(dir);
//   
//        printEmployee(eng, esp);
//        printEmployee(adm, esp);
//        printEmployee(mgr, esp);
//        printEmployee(dir, esp);
//        
//        System.out.println("\nTesting raiseSalary and setName on Manager:");
//        mgr.setName("Barbara Johnson-Smythe");
//        mgr.raiseSalary(10_000.00);
//        printEmployee(mgr, esp);
//        
        
        
        List<Employee> emps = new ArrayList<Employee>();
        emps.add(eng);
        emps.add(mgr);
        emps.add(adm);
        emps.add(dir);
        
        System.out.println("=======Unsorted=======");
        emps.forEach(o->System.out.println(o));
        
        System.out.println("=======Sorted by ID=======");
        Collections.sort(emps);
        emps.forEach(o->System.out.println(o));
        
        System.out.println("=======Top 4 Highest Paid Employee=======");
        
//       Collections.sort(emps,new SalarySorted());
//       List <Employee> topFours = emps.subList(0, 4);
//       topFours.forEach(o->System.out.println(o));
        
	      Collections.sort(emps,(e1, e2)->{
	    	  if(e1.getSalary()<e2.getSalary()) 
	  			return 1;
	  		else if(e1.getSalary()> e2.getSalary())
	  			return -1;
	  		else
	  			return 0;
	      });
	  
	      emps.subList(0, 4).forEach(o->System.out.println(o));	
	     
       
      
    }

    

}
