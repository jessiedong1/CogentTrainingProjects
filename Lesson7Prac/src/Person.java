
public class Person implements Comparable<Person>{
	int id; 
	String name;
	int age;
	double salary;
	
	public Person(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age ;
	}
	

	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
	
		if(this.id<p.id) 
			return -1;
		else if(this.id > p.id)
			return 1;
		else
			return 0;
		
		
	}
	
	public void display() {
		System.out.println(this);
	}
	
	

}
