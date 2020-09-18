package my.spring.demo.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.spring.demo.EmployeeDAO;

@RestController
public class HelloController {
	//Interface Injection
	EmployeeDAO e;

	
//	@Autowired
//	public HelloController(Employee e) {
//		this.e  = e;
//	}
	@RequestMapping("/my")
	public String index() {
		return "Greetings " + e.display() + " and Spring Boot!";
	}
//	public Employee getE() {
//		return e;
//	}
	@Autowired
	public void setE(EmployeeDAO e) {
		this.e = e;
	}
	
	

}
