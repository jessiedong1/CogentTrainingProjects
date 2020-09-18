import java.util.ArrayList;
import java.util.List;

public class Main1 {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(11);
		numList.add(12);
		numList.add(13);
		numList.add(4);
		numList.add(15); 
		for(Integer i: numList) {
			System.out.println(i.intValue());
			numList.add(i.intValue()*10);
		}
		
	}

}
