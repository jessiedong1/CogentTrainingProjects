package com.app.Mockito;

import static org.junit.Assert.assertEquals;  
import static org.mockito.Mockito.mock;  
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestEmployeeService {
	@Test
	public void test() {
		EmployeeService service = mock(EmployeeService.class);
		List <String> list = Arrays.asList(" Use Core Java ", " Use Spring Core ", " Use w3eHibernate ", " Use Spring MVC ");  
		when(service.findAll("Dummy")).thenReturn(list);
		
		EmployeeApp eapp = new EmployeeApp(service);
		List<String> alltd = eapp.getData("Dummy");
		
		System.out.println(alltd);
		assertEquals(2,alltd.size());
		
	}

}
