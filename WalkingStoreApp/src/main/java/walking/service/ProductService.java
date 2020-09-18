package walking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import walking.jpa.ProductRepository;
import walking.model.Product;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepo;
	
	public List<Product> findByNameContains(String name){
		return productRepo.findByProductNameContains(name);
	}
	
	
}
