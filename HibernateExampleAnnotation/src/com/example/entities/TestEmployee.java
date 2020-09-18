package com.example.entities;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class TestEmployee {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("com/example/cfg/hibernate.cfg.xml");
		SessionFactory f = cfg.buildSessionFactory();
		Session s = f.openSession();
		//Mapping Example
		//Get employee information 
		Employee e = s.get(Employee.class, 2);
		System.out.println(e.getId() + ":" + e.getName() +":" + e.getSalary() +":" + e.getDept().getDeptName());
		
		//Get department information 
		Department dept = s.get(Department.class, 101);
		System.out.println(dept.getDeptId() +":" + dept.getDeptName());
		
		//Get the employees work for department 101
		System.out.println("-------------Employees works for HR Department-------------");
		List<Employee> empList = dept.getEmpList();
		empList.forEach(emp->System.out.println(emp));
		
		//Select employees from HR department
		Query q2 = s.createQuery("select e.name,e.salary,e.dept from Employee e, Department dept where dept.deptName =:dname");
		q2.setParameter("dname", "HR");
		List<Employee[]> empList1 = (List<Employee[]>)q2.list();
		System.out.println("-------------Employee name and salary works for HR Department-------------");
		for(Object[] ee: empList1) {
			Department d = (Department)ee[2];
			System.out.println("Name: " +ee[0] +" Salary: "+ ee[1] + " Department: " + d.getDeptName());
			
		}

		
		
		//Query Example
//		Query q1 = s.createQuery("select e.id,e.name from Employee e where e.salary >:esal");
//		q1.setParameter("esal", 200.00);
//		List<Employee[]> empList = q1.list();
//		for ( Object[] e : empList ) {
//		     System.out.print(e[0]);
//		     System.out.println(e[1]);
//		}



	}

}
