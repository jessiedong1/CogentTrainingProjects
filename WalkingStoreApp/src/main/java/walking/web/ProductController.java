package walking.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import walking.jpa.ProductRepository;
import walking.model.Product;

@RestController
//@RequestMapping(value = "SearchProduct")
public class ProductController {
	@Autowired
	ProductRepository productRepo;
	
	@GetMapping("/SearchProduct")
		public List<Product> allProducts(@RequestParam("productname") String title){
			System.out.println(productRepo.findByProductNameContains(title).get(0));
			return productRepo.findByProductNameContains(title);
		}
	
	

//	
//	@GetMapping("/SearchProduct")
//	public String searchResult(@RequestParam (name = "productname",required=false, defaultValue="shoes")String name, Model model) {
//		List<Product> products = productRepo.findByProductNameContains(name);
//		System.out.println(products.get(0).getProductName());
//		model.addAttribute("products", name);
//		return "productsearch.jsp";
//		
//	}
//	

}


