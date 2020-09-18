package cogent.hr.eapp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CascadeType;

@Entity @Table(name = "EMPLOYEE")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id @Column(name = "EMP_ID")
	private int id;
	
	@Column(name ="EMP_NAME")
	private String name;
	
	@Column(name = "EMP_SALARY")
	private double salary;
	
	@ManyToOne()
	@JoinColumn(name="Dept_Id")
//	@Column(name= "Dept_Id")
	private int dept;
	
	public Employee(int id, String name, double salary, int dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDept() {
		return dept;
	}

	public void setDept(int dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", salary=" + salary + ", dept="  ;
	}
	


}

