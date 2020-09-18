package com.example.dao.impl;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import com.example.dao.EmployeeDao;
import com.example.model.Employee;

@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	private void init() {
		setDataSource(dataSource);
	}
	
	
	@Override
	public void insertEmployee(Employee e) {
		// TODO Auto-generated method stub
//		String sql = "INSERT INTO employee(empId, empName) VALUES (?,?)";
		String sql = "INSERT INTO employee (empId, empName) VALUES (?, ?)";
		getJdbcTemplate().update(sql, new Object[]{e.getEmpId(), e.getEmpName()});
		
	}

	@Override
	public void deleteEmployeeById(String eid) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM employee WHERE empId = ?";
		getJdbcTemplate().update(sql, new Object[] { eid });
		
	}

}
