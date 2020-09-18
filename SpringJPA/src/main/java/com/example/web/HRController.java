package com.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.RecordNotFoundException;
import com.example.jpa.DepartmentRepository;
import com.example.model.Employee;
import com.example.service.EmployeeSerivce;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/hr")
public class HRController {
	@Autowired
	EmployeeSerivce eService;
	@Autowired
	DepartmentRepository dRepo;

	@CrossOrigin
	@GetMapping(produces = "application/json")
	public List<Employee> allEmployee(){
		return eService.all();
	}
	@CrossOrigin
	@GetMapping(value = {"/find/{id}"}, produces = "application/json")
	public ResponseEntity<Object> findEmployee(@PathVariable int id) throws RecordNotFoundException{
		HttpHeaders headers = new HttpHeaders();

		Employee entity = eService.find(id);
			if(entity ==null)
				throw new RecordNotFoundException("EMP ID " + id + " Not FOUND");

		
		return new ResponseEntity<>(entity, headers,HttpStatus.OK);
	}
	@CrossOrigin
	@GetMapping(value = {"/find"},produces = "application/json")
	public ResponseEntity<Object> findEmployee1(@RequestParam("id") int id) throws RecordNotFoundException{

		HttpHeaders headers = new HttpHeaders();

		Employee entity = eService.find(id);
		if(entity ==null)
			throw new RecordNotFoundException("EMP ID " + id + " Not FOUND");
		
		return new ResponseEntity<>(entity, headers, HttpStatus.OK);
	}

	@CrossOrigin
	@PostMapping(value = {"/insert"},produces = "application/json")
	public ResponseEntity<Object> insertEmployee(@RequestParam("ename") String name,@RequestParam("esalary") double sal, @RequestParam("dname") String dname)  throws RecordNotFoundException{
		Employee e = null;
		e = eService.insert(new Employee(name,sal,dRepo.findByDeptName(dname)));
//		if(e==null)
//				throw new RecordNotFoundException("Missing value");
		return new ResponseEntity<>( e,new HttpHeaders(), HttpStatus.OK);
	}

	
}
