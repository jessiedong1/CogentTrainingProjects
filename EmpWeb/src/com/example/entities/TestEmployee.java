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

		
		Employee e = new Employee(50, "Mike", 1010.00);
		Department dept = s.get(Department.class, 102);
		e.setDept(dept);
		Transaction tx = s.getTransaction();
		try {
			tx.begin();
			s.save(e);
			tx.commit();
			System.out.println("Object Inserted");
			
		}catch(Exception ex) {
			tx.rollback();
			System.out.println(ex.toString());
		}
		
//		Employee e = s.get(Employee.class,1);
//		System.out.println(e);
//		System.out.println(s.save(e));
		
		




	}

}
