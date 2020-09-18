package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.RecordNotFoundException;
import com.example.jpa.EmpoyeeRepository;
import com.example.model.Employee;

@Service
public class EmployeeSerivce {
	@Autowired
	EmpoyeeRepository eRepo;
	
	public List<Employee> all(){
		return eRepo.findAll();
	
	}
	public Employee find(int id) {
//			throws RecordNotFoundException{
		Employee ee =null;
		Optional<Employee> e =eRepo.findById(id);
		if(e.isPresent())
			ee = eRepo.findById(id).get();
//		else
//			throw new RecordNotFoundException("Employee with ID "+ id + "doesn't exist");
		
		return ee;
	}
	public Employee insert(Employee e) {
		if (e != null)
				return eRepo.save(e);
		return e;
		
	}

}
