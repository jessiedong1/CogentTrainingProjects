
public class MyTask extends Thread{
	private String name;
	
	public MyTask(String name) {
		super(name);
		
	}

	public void run() {
		for( int i = 1; i<=10;i++)
			System.out.println(this.name + i);
	}
}
