package my.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee implements EmployeeDAO{
	private int id;
	private String name;
	public Employee() {
		this.id = 1;
		this.name = "Be";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String display() {
		// TODO Auto-generated method stub
		return name;
	}
	

}
