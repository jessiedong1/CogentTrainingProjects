import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestException2{
	private static Logger logger = Logger.getLogger("TestException2");
	
	public static void readFile(String name) throws MyException{
		
		try {
			FileReader fr = new FileReader(name);
			logger.log(Level.INFO,"File has been openned");
			Scanner sc = new Scanner(fr);
			logger.log(Level.INFO, "Content has been dispayed");
			System.out.println(sc.nextLine());
		
		}catch(NullPointerException | FileNotFoundException e) {
			throw new MyException("Error opeening the file", e);	
		}
//		System.out.println("1");
		logger.log(Level.INFO, "Exiting from read file");
	}

	public static void main(String[] args) {
		logger.setLevel(Level.INFO);// Will only catch the level of INFO and above. The information that has to be recorded 
		SimpleFormatter sm = new SimpleFormatter();
		//Add Handler
		FileHandler fs;
		try {
			fs = new FileHandler("/Users/jessiedong/Documents/Cogent_Training/SecondWeek/08_24/jessie.log");
			fs.setFormatter(sm);
			logger.addHandler(fs);
		} catch (SecurityException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		logger.log(Level.INFO, "Entering Main");
		String fileName = "/Users/jessiedong/Documents/Cogent_Training/SecondWeek/08_24/jessie";
		try {
			readFile(fileName);
		}catch(MyException e) {
			
//			e.printStackTrace();
			logger.log(Level.SEVERE,e.toString());
		}
//		System.out.println(2);
//		new A().addUser("Jessie");
		A a = new A();
		a.addUser("Nitin");
		a.list();
		logger.log(Level.INFO, "Exciting Main");
		logger.log(Level.FINE," This will not be displayed");
	}

}
