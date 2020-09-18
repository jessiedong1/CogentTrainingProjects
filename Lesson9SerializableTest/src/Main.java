import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Fluent approach
		
		//method chaining -- stream
		Employee.Builder builder = new Employee.Builder();
		List<Employee> empList = new ArrayList<>();
		
	
		empList.add(builder.id(1)
				.name("Jessie")
				.salary(12000)
				.build());

		empList.add(builder
				.name("Ben")
				.id(2)
				.salary(30)
				.build());
		
//		empList.forEach(t->System.out.println(t));
		
//		try (
//				FileOutputStream fos = new FileOutputStream("/Users/jessiedong/Documents/Cogent_Training/SecondWeek/08_25/emp.data");
//				ObjectOutputStream oos = new ObjectOutputStream(fos))
//				
//			{
//				oos.writeObject(empList.get(0));
//			}catch(FileNotFoundException e) {
//				e.printStackTrace();
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			
		Employee e2 = null;
		try (
			FileInputStream fos = new FileInputStream("/Users/jessiedong/Documents/Cogent_Training/SecondWeek/08_25/emp.data");
			ObjectInputStream oos = new ObjectInputStream(fos))
			
		{
			e2 = (Employee) oos.readObject();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(e2);

	}
}
