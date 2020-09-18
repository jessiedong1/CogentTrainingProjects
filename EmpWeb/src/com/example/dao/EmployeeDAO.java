package com.example.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.example.entities.Department;
import com.example.entities.Employee;

public class EmployeeDAO {
	private static final EmployeeDAO instance = new EmployeeDAO();
//	private static SessionFactory sf = null;
	private Session s = null;
	
	private EmployeeDAO() {
		this.s= FactoryDAO.getSessionFactory().openSession();
	}
	public static EmployeeDAO getInstance() {
		
		return instance;
	}
	
	public Employee find(int id) {
		Employee e =s.get(Employee.class, id);
		return e;
		
	}
	
	public String insert(Employee e, int deptId) {
		Department dept = s.get(Department.class, deptId);
		if(dept==null)
			return "You have to create the Department "+ deptId + " before you can update the information";
		e.setDept(dept);
		Transaction tx = s.getTransaction();
		try {
			tx.begin();
			s.save(e);
			tx.commit();
			return "success";
			
		}catch(Exception ex) {
			tx.rollback();
			System.out.println(ex.toString());
		}	
		return "The id " + e.getId() + "has been used. Please insert a unique Employee ID";

	}
	public String update(Employee e,int deptId) {
	
		Department dept = s.get(Department.class, deptId);
		if(dept==null)
			return "You have to create the Department before you can add employee";
		e.setDept(dept);
		Transaction tx = s.getTransaction();
		try {
			tx.begin();
			s.update(e);
			tx.commit();
			return "success";
			
		}catch(Exception ex) {
			tx.rollback();
			System.out.println(ex.toString());
		}	
		
		return "Please enter a valid Employee ID";
	}
	
	public Employee delete(int id) {
		Employee e = s.get(Employee.class, id);
		System.out.println(e);
		if(e != null) {
		Transaction tx = s.getTransaction();
		try {
			tx.begin();
			s.delete(e);
			tx.commit();			
		}catch(Exception ex) {
			tx.rollback();
			System.out.println(ex.toString());
		}	}
		
		return e;
	}
	public List<Employee> retrieveAll(){
		return s.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
		
		
	}

		
}
