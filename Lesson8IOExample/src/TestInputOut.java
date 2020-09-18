import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestInputOut {

	public static void main(String[] args) {
		try(BufferedReader input = new BufferedReader(new FileReader(args[0]));
				BufferedWriter output = new BufferedWriter(new FileWriter(args[1]))){
			while(input.lines() != null) {
				System.out.println("Hi");
			}
			
		}catch(FileNotFoundException fx) {
			fx.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
