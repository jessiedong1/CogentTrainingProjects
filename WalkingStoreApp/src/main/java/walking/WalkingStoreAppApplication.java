package walking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import walking.jpa.CategoryRepository;
import walking.jpa.ProductRepository;
import walking.model.Category;
import walking.model.Product;

@SpringBootApplication
public class WalkingStoreAppApplication {
//implements CommandLineRunner {


		public static void main(String[] args) {
			SpringApplication.run(WalkingStoreAppApplication.class, args);
			
		}
	//
//		@Override
//		public void run(String... args) throws Exception {

	
			
//			productRepo.save(new Product(0100,"New Design Shoes",100.00,categoryRepo.findById(1).get()));
			
			
//			dRepo.save(new Department(101,"HR"));
//			dRepo.save(new Department(102,"Engineer"));
//			dRepo.save(new Department(103,"Sales"));
//			
//			eRepo.save(new Employee(1, "Jessie", 100.00, dRepo.findById(101).get()));
//			eRepo.save(new Employee("Benny", 550.00, dRepo.findById(103).get()));
//			eRepo.save(new Employee("Josie", 1090.00, dRepo.findById(102).get()));
//			eRepo.save(new Employee("Vivian", 1000.00, dRepo.findById(103).get()));
//			eRepo.save(new Employee("Tom", 11100.00, dRepo.findById(102).get()));
			
//}
}
