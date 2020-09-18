import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setId(1);
		p1.setFirstName("Jessie");
		p1.setLastName("Dong");
		p1.setAge(10);
//		Person p2 = new Person();
//		p2.setId(1);
//		p2.setFirstName("Jessie");
//		p2.setLastName("Dong");
//		p2.setAge(10);
//		
//		System.out.println(p1==p2);
//		System.out.println(p1.hashCode() + "	and	" + p2.hashCode()); //hashSet, JVM is a processor for java program 
//		System.out.println(p1.equals(p2));
//		HashSet<Person> hs = new HashSet<Person>();
//		hs.add(p1);
//		hs.add(p2);
//		System.out.print(hs);
		try {
			Person p2 = (Person) p1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	
	}

}
