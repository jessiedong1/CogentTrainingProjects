package com.example.dao;

import com.example.model.Employee;

public interface EmployeeDao {
	void insertEmployee(Employee e);
	void deleteEmployeeById(String eid);
	
}
