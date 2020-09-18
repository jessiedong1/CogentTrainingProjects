package cogent.batch52.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Minor {


	public static void main(String [] args) {
		List names = Arrays.asList("Jupiter", "Naptune", "Mars", "Earht");
		
		
		Map<Integer,List> name_length = (Map<Integer, List>) names.stream().collect(Collectors.groupingBy(p->((String) p).length()));
		
		name_length.forEach((l,s)->System.out.print(l + " " + s));
	} 
}