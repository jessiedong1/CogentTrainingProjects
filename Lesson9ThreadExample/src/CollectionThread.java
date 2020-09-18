//08/26 how to make ArrayList synchronized 
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class AddElementsIntoCollection implements Runnable {
	//Method 1 use synchronized keyword
//	private ArrayList<String> wordList = new ArrayList<>();
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		synchronized(wordList) {
//		wordList.add("One");
//		wordList.add("Two");
//		wordList.add("Three");
//		}
//		
//	}
//	public void display() {
//		wordList.forEach(w->System.out.println(w));
//	}
	//Method 2: java.util.concurrent.CopyOnWriteArrayList;
	private CopyOnWriteArrayList<String> wordList = new CopyOnWriteArrayList<>();
			public void run() {
			// TODO Auto-generated method stub
			
			wordList.add("One");
			wordList.add("Two");
			wordList.add("Three");
			
		}
			public void display() {
			wordList.forEach(w->System.out.println(w));
		}
	//Method 3: ReentrantLock key = new ReentrantLock()
}
public class CollectionThread{
	public static void main(String []args) {
		AddElementsIntoCollection task1 = new AddElementsIntoCollection();
		ExecutorService ex = Executors.newCachedThreadPool();
		ex.submit(task1);
		ex.submit(task1);
		ex.shutdown();
		task1.display();
	
		
		
		
		
	}
	

}
