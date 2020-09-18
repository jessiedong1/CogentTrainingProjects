package com.example.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.model.Employee;

public interface EmpoyeeRepository extends JpaRepository<Employee, Integer>{
	public List<Employee> findByName(String name);
	

}
