import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(4);
		Future<String> f1 = es.submit(new ExampleCallable("ONE", 10));
		Future<String> f2 = es.submit(new ExampleCallable("TWO", 20));
		
		es.shutdown();
		try {
			es.awaitTermination(5, TimeUnit.SECONDS);
			String result1 = f1.get();
			System.out.println("Result of one: "+ result1);
			String result2= f2.get();
			System.out.println("Result of one: "+ result2);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
