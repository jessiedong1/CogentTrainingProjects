package com.example.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.model.Department;
import com.example.model.Employee;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	public Department findByDeptName(String name);
	
	@Query("Select dept from Department dept where dept.deptId > :deptNum")
	public List<Department> listDepartmentByDeptNum(@Param("deptNum") int deptNum);
	
	default String retS (String name) {
		return name;
	}

	
	
	
	
	

}
