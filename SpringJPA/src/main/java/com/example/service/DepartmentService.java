package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired 
	DepartmentRepository dRepo;
	
	public String calS(String name) {
		return dRepo.retS(name).toLowerCase();
	}

}
