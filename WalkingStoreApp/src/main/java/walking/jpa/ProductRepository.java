package walking.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import walking.model.Product;

public interface ProductRepository  extends JpaRepository<Product, Integer>{
	List<Product> findByProductNameContains(String title);
}
