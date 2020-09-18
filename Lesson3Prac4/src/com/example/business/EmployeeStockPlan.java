package com.example.business;

import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Manager;

public class EmployeeStockPlan {
	public int grantStock(Employee e) {
		if (e instanceof Director ) {
			return 1000;
		}
		else if(e instanceof Manager) {
			return 100;
		}
		else {
			return 10;
		}
	}

}
