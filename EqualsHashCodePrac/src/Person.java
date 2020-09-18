public class Person implements Cloneable{
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email="
				+ email + "]";
	}
	@Override
	public int hashCode() {
		return id;
	
	}
	
//	public boolean equals(Object obj) {
//		return this.hashCode() == obj.hashCode();
//	}
	public Object clone() throws CloneNotSupportedException 
	{ 
	return super.clone(); 
	} 
		
	
}
