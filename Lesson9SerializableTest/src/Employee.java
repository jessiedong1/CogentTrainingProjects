import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double salary;
	private transient double annualSalary;
	
	private Employee(Employee.Builder bd)  {
		this.id = bd.id;
		this.name = bd.name;
		this.salary = bd.salary;
		this.annualSalary = salary*12;
	}
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		this.annualSalary = this.salary *12;
	}
	//Inner class
	public static class Builder{
		private int id;
		private String name;
		private double salary;
		
		public Employee.Builder id(int id){
			this.id = id;
			return this;
			
		}
		
		public Employee.Builder name(String name){
			this.name = name;
			return this;
			
		}
		public Employee.Builder salary(double salary){
			this.salary= salary;
			return this;
		}
		
		public Employee build() {
			return new Employee(this);
		}
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", annualSalary=" + annualSalary + "]";
	}
	

}
