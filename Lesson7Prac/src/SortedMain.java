import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<String> ss = new TreeSet<>(); // Only for natural order
//		ss.add("Nitin");
//		ss.add("Alex");
//		ss.add("Thiarno");
//		ss.add("Morra");
//	
//		System.out.println(ss);
		List<Person> arr = new ArrayList<Person>();
		arr.add(new Person(20, "Peter", 43,1000.10));
		arr.add(new Person(34, "Alex", 23,1100.10));
		arr.add(new Person(19, "Tim", 22,1200.10));
		arr.add(new Person(33, "Trace", 21,1230.50));
		arr.add(new Person(26, "Jessie", 23, 5617.22));
		
//		Collections.sort(arr, (p1,p2)->p1.getName().compareTo(p2.getName()));
//		arr.forEach(o->System.out.println(o));
//		
//		System.out.println("=================");
//		Collections.sort(arr);
////		arr.stream().filter(p->p.age < 40).forEach(p->System.out.println(p));
//		//Method Reference
////		arr.stream().filter(p->p.age < 40).forEach(Person::display);
////		arr.forEach(o->System.out.println(o));
//		arr.stream().filter(p->p.age<40).forEach(A::show);
	
//		arr.stream().mapToDouble(p->p.salary).sum();
		arr.stream()
				.peek(A::show)
				.mapToDouble(p->p.salary)
				.peek(sal->System.out.println(sal));
	
		
//		System.out.print(total);
		
//		
//		System.out.println("=================");
//		Collections.sort(arr,new NameSort());
//		//Java 8 
//		arr.forEach(o->System.out.println(o));
		
		//Convert array to Collections
		
		LocalDate date = LocalDate.of(1995, 10, 10);
		LocalDate dd = Year.of(1995).atMonth(3).atDay(3);
	
		
		
	}

}
