package com.sportyshoes.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.app.model.Product;
import com.sportyshoes.app.repository.ProductRepository;

@RestController
@RequestMapping("products")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping("all")
	public List<Product> getAllProduct() {
		List<Product> product = (List<Product>) productRepository.findAll();
		return product;
	}

	@PostMapping("add")
	public Product addProduct(@RequestBody Product product) {
		return productRepository.save(product);

	}

	@GetMapping("productSearchById/{id}")
	public Optional<Product> findById(@PathVariable int id) {
		return productRepository.findById(id);
	}

	@PutMapping("product/{id}")
	public Product updateProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}

	@DeleteMapping("product/{id}")
	public void deleteProduct(@PathVariable int id) {
		productRepository.deleteById(id);
	}

	
	  @GetMapping("productByName/{pName}") public List<Product>
	  findProductByName(@PathVariable String pName){ 
		  return productRepository.findByName(pName); 
	  }
	  
	  @GetMapping("productBySeason/{pName}") public List<Product>
	  findProductBySeason(@PathVariable String pName){ 
		  return productRepository.findBySeason(pName); 
	  }
	  
	  @GetMapping("productByBrand/{pName}") public List<Product>
	  findProductByBrand(@PathVariable String pName){ 
		  return productRepository.findByBrand(pName); 
	  }
	  
	  @GetMapping("productByCateogry/{pName}") public List<Product>
	  findProductByCateogry(@PathVariable String pName){ 
		  return productRepository.findByCateogry(pName); 
	  }
	  
	  @GetMapping("productByPrice/{pName}") public List<Product>
	  findProductByPrice(@PathVariable String pName){ 
		  return productRepository.findByPrice(pName); 
	  }
	  
	  @GetMapping("productByColor/{pName}") public List<Product>
	  findProductByColor(@PathVariable String pName){ 
		  return productRepository.findByColor(pName); 
	  }
	  
	  @GetMapping("productByDate/{pName}") public List<Product>
	  findProductByDate(@PathVariable String pName){ 
		  return productRepository.findByLatestDate(pName); 
	  }
	
}
