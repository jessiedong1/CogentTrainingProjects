package walking.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import walking.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	

}
