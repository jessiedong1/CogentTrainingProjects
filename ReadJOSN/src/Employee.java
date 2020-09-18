
public class Employee {
	private int id;
	private String name;
	private double salary;
	private Department dept;
	public Employee(int id, String name, double salary, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", salary=" + salary + ", Department :deptId=" + dept.getDeptId() + "deptName=" + dept.getDeptName() ;
	}

	
}
