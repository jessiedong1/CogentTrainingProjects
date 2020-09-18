
public class Main {

	public static void main(String[] args) {
		//The threads are running in parallel 
//		MyTask task1 = new MyTask("A");
//		MyTask task2 = new MyTask("B");
//		task1.start();
//		task2.start();
		Thread t1 = new Thread(new SeperateTask());
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i =1; i<=10;i++) 
					System.out.println("Runnable Task" + i);
			}
			
		});
		for(int i=1;i<=10;i++) 
			System.out.println("Main "+i);
		Thread t3 = new Thread(()->{
			for(int i =1; i<=10;i++) {
				if(i==5)
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println("LambdaTask" + i);
			}
			
		});
		t1.start();
		t2.start();
		t3.start();
	}

}
