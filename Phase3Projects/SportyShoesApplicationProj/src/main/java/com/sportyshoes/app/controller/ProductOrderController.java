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

import com.sportyshoes.app.model.ProductOrder;
import com.sportyshoes.app.repository.ProductOrderRepository;

@RestController
@RequestMapping("productorders")
public class ProductOrderController {
	
 @Autowired
 private ProductOrderRepository productOrderRepository;

 @GetMapping("all")
 public List<ProductOrder> getAllProductOrder(){
	 List<ProductOrder> productOrder = (List<ProductOrder>) productOrderRepository.findAll();
	  return productOrder;
  }
 
 
 @PostMapping("add")
 public ProductOrder addProdcutOrder(@RequestBody ProductOrder productOrder) {
	 return (ProductOrder) productOrderRepository.save(productOrder);
 }	
 
 
 @GetMapping("productorder/{id}")
public Optional<ProductOrder> getProductOrderById(@PathVariable int id) {
	 return productOrderRepository.findById(id);
 }
 
 @PutMapping("productorder/{id}")
 public ProductOrder updateProductOrder(@RequestBody ProductOrder productOrder) {
	return  productOrderRepository.save(productOrder);
 }
 
 @DeleteMapping("productorder/{id}")
 public void deleteProdcutOrder(@PathVariable int id) {
	 productOrderRepository.deleteById(id);
 }
 
}
