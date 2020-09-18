package com.example.service;

import com.example.model.Employee;
import com.example.model.EmployeeHealthInsurance;

public interface OrganizationService {
	void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);
	void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

}
