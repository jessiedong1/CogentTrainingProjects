package com.example.entites;

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
//		Employee e = s.get(Employee.class, 0);
//		System.out.println(e);
//		Employee eload = s.load(Employee.class, 0);
//		if(eload!=null) {
//			System.out.println(1);
//		}
//		System.out.println(eload.getName());
//		
		//Example 2
//		Employee e = new Employee(17,"Eldeep", 1300.00,101);
//		Employee ee = new Employee(18,"Jessie", 1300.00,101);
//		Employee e = s.get(Employee.class, 1);
//		Employee e2 = s.get(Employee.class, 2);
//		if(e!=null && e2!=null) {
//			e.setSalary((e.getSalary()+200));
//			e2.setSalary((e.getSalary()-200));
//		
//		Transaction tx = s.getTransaction();
//		try {
//			tx.begin();
//			s.update(e);
//			s.saveOrUpdate(e2);
//			tx.commit();
//			System.out.println("Object Inserted");
//			
//		}catch(Exception ex) {
//			tx.rollback();
//			System.out.println(ex.toString());
//		}
//		}else {
//			System.out.println("Send or Recepient or both record don't exist");
//		}
//		
		
		//Query
		Query<Employee> q1 = s.createQuery("from Employee e where e.id =:eid ", Employee.class);
		q1.setParameter("eid", 2);
		List<Employee> ll = q1.list();
		ll.forEach(e->System.out.println(e));
		

	}

}
