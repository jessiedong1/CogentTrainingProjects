package com.example;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.client.RestTemplate;

import com.example.jpa.DepartmentRepository;
import com.example.jpa.EmpoyeeRepository;
import com.example.model.Department;
import com.example.model.Employee;
import com.example.service.DepartmentService;
import com.example.service.EmployeeSerivce;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	EmployeeSerivce eService;
	
	@Autowired
	DepartmentService dService;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info(dService.calS("Jessie"));
		
	}

//	@Override
//	public void run(String... args) throws Exception {
//		URL url = new URL("http://localhost:8080/hr");
//		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
//		conn.setRequestMethod("GET");
//		conn.connect();
//		 int responsecode = conn.getResponseCode(); 
//		 if(responsecode!=200)
//			 throw new RuntimeException("HttpReponseCode: " + responsecode);
//		 else {
//			 String inline = "";
//			 Scanner sc = new Scanner(url.openStream());
//			 while(sc.hasNext())
//			 {
//			
//			 inline+=sc.nextLine();
//			 }
//			 System.out.println("\nJSON data in string format");
//			 System.out.println(inline);
//			 sc.close();
//		 }
		
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
			
	
}







//public class SpringJpaApplication implements CommandLineRunner {
//	@Autowired 
//	EmpoyeeRepository eRepo;
//
//	@Autowired 
//	DepartmentRepository dRepo;
//	public static void main(String[] args) {
//		SpringApplication.run(SpringJpaApplication.class, args);
//		
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
////		dRepo.save(new Department(101,"HR"));
//		dRepo.save(new Department(102,"Engineer"));
//		dRepo.save(new Department(103,"Sales"));
		
//		eRepo.save(new Employee(1, "Jessie", 100.00, dRepo.findById(101).get()));
//		eRepo.save(new Employee("Benny", 550.00, dRepo.findById(103).get()));
//		eRepo.save(new Employee("Josie", 1090.00, dRepo.findById(102).get()));
//		eRepo.save(new Employee("Vivian", 1000.00, dRepo.findById(103).get()));
//		eRepo.save(new Employee("Tom", 11100.00, dRepo.findById(102).get()));
		
		
		
		
//		List<Department> deptList = (List<Department>)dRepo.findAll(Sort.by(Sort.Direction.DESC,"deptId"));
//		List<Department> deptList = (List<Department>)dRepo.findAll(Sort.by("deptName").descending());

//		List<Department> deptList = (List<Department>) dRepo.findAll();
//		List<Department> deptList = (List<Department>) dRepo.findByDeptName("HR");
//		List<Department> deptList = (List<Department>) dRepo.listDepartmentByDeptNum(102);
//		deptList.forEach(dept->System.out.println(dept));
		
//		
//		int numEmployee = (int)eRepo.count();
//		System.out.println(numEmployee);

//		int i =0;
//		while(i <=count) {
//			Pageable pageable = PageRequest.of(i, 3);
//			Page<Employee> page = eRepo.findAll(pageable);
//			page.forEach(e->System.out.println(e));
//			count--;
//			i++;
//			System.out.println(i);
//			System.out.println(count);
//			
//		}
//		
//		Pageable pageable = PageRequest.of(0, 3);
//		Page<Employee> page = eRepo.findAll(pageable);
//		page.forEach(e->System.out.println(e));

		
//		Optional<Employee> opt = eRepo.findById(1);
//		
//		if(opt.isPresent())
//			System.out.println(opt.get());
//		

//	}
//
//}
