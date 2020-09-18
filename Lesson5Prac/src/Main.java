import static com.example.Status.ON;
import static com.example.Status.OFF;
import static com.example.Status.SLEEP;
import com.example.Computer;

public class Main {

	public static void main() {
		// TODO Auto-generated method stub
		Computer c1 = new Computer();
		c1.setStatus(OFF);	//0 off, 1 on, 2 sleep
//		c1.setStatus(10);
		System.out.println(c1.getStatus().getDescription());
		
		c1.setStatus(ON);	//0 off, 1 on, 2 sleep
//		c1.setStatus(10);
		System.out.println(c1.getStatus().ordinal());
		c1.setStatus(SLEEP);	//0 off, 1 on, 2 sleep
//		c1.setStatus(10);
		System.out.println(c1.getStatus().ordinal());


	}}
 