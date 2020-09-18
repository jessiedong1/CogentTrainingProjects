package com.app.Mockito;

import java.util.ArrayList;
import java.util.List;

public class EmployeeApp {
	private EmployeeService service;
	
	public EmployeeApp(EmployeeService service) {
		super();
		this.service=service;
	}
	
	public List<String> getData(String user){
		List<String> retriveData = new ArrayList<>();
		List<String> list = service.findAll(user);
		
		for(String s: list) {
			if(s.contains("Spring")) {
				retriveData.add(s);
			}
		}
		
		return retriveData;
		
	}

}
