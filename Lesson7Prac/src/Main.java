import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> arr =new ArrayList<Integer>(3);
//		arr.add(10);
//		arr.add(20);
//		arr.add(30);
//		System.out.println(arr);
//		arr.add(40);
//		arr.add(50);
		List arr = new ArrayList(3);
		arr.add(10);
		arr.add(20);
		arr.add("Jessie");
		arr.add(new Date());
		
		//Iterator
		Iterator ir = arr.iterator();
		while(ir.hasNext())
			System.out.println(ir.next());
		
		//Java 5 
		for(Object o: arr) {
			System.out.println(o);
			
		}
		
		//Java 8 Lambda expression
		arr.forEach(o->System.out.println(o));
		


	}

}
