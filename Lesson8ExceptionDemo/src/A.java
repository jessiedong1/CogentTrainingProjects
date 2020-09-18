import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class A {
	private Logger logger = Logger.getLogger("A");
	public void addUser(String username) {
		logger.log(Level.INFO, username + " is created");
	
		
	}
	public void list() {
		List<String> userList = new ArrayList<String>();
		userList.add("Nitin");
		userList.add("Nita");
		userList.add("Morra");
		userList.add("Nora");
		long c = userList.stream().filter(s->s.startsWith("N")).peek(s->logger.info(s)).count();
		logger.info("Count" + c);
	}

}
