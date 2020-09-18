import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		URL url = new URL("http://localhost:8082/cogent/hr");
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();
		 int responsecode = conn.getResponseCode(); 
		 if(responsecode!=200)
			 throw new RuntimeException("HttpReponseCode: " + responsecode);
		 else {
			 Scanner sc = new Scanner(url.openStream());
			 String inline = sc.nextLine();

			 System.out.println("\nJSON data in string format");
			 System.out.println(inline);
			 sc.close();
		 
			 JSONArray objarr = new JSONArray(inline);
			 List<Employee> empList = new ArrayList<Employee>();
			 for(int i =0;i< objarr.length();i++) 
				{
					JSONObject empObj = objarr.getJSONObject(i);
					JSONObject deptObj = empObj.getJSONObject("dept");
					empList.add(new Employee(empObj.getInt("id"), empObj.getString("name"),empObj.getDouble("salary"), new Department(deptObj.getInt("deptId"),deptObj.getString("deptName"))));
			
				}
			 empList.forEach(e->System.out.println(e));
		 }
		
		 
		
		//Method 2
//		String url = "http://localhost:8080/cogent/hr";
//		RestTemplate restTemplate = new RestTemplate();
//		String resp = restTemplate.getForObject(url, String.class);
//		System.out.println(resp);
//		JsonParser springParser = JsonParserFactory.getJsonParser();
//
//		List<Object> list = springParser.parseList(resp);
//
//		for(Object o : list) {
//			if(o instanceof Map) {
//				Map<String,Object> map = (Map<String,Object>) o;
//				System.out.println("Items found: " + map.size());
//
//				int i = 0;
//				for (Map.Entry<String, Object> entry : map.entrySet()) {
//					System.out.println(entry.getKey() + " = " + entry.getValue());
//					i++;
//				}
//
//			}
//		}
//			
//	}

}
}
