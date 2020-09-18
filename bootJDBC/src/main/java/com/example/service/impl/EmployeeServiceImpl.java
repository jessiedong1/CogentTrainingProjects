package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.EmployeeDao;
import com.example.model.Employee;
import com.example.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao employeeDao;

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeeDao.insertEmployee(emp);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void deleteEmployeeById(String empid) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployeeById(empid);
		
	}

}
