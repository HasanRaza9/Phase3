package com.sportyshoes.app.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sportyshoes.app.model.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
	
	
@Query(value = "Select product_Id,product_Name, season,brand,category,price,color,created_Date,discount,quantity from Product p where LOWER(p.product_Name) = LOWER(?1)"
	  ,nativeQuery = true) 
public List<Product> findByName(String pName);
	 
//(winter, summer, rainy)
@Query(value = "Select product_Id,product_Name, season,brand,category,price,color,created_Date,discount,quantity from Product p where LOWER(p.season) = LOWER(?1)"
,nativeQuery = true) 
public List<Product> findBySeason(String pName);

//brand(nike /adidas/ puma)
@Query(value = "Select product_Id,product_Name, season,brand,category,price,color,created_Date,discount,quantity from Product p where LOWER(p.brand) = LOWER(?1)"
,nativeQuery = true) 
public List<Product> findByBrand(String pName);

//cateogry( male / female / both)
@Query(value = "Select product_Id,product_Name, season,brand,category,price,color,created_Date,discount,quantity from Product p where LOWER(p.category) = LOWER(?1)"
,nativeQuery = true) 
public List<Product> findByCateogry(String pName);

//- price (Asc/ Desc order)
@Query(value = "Select product_Id,product_Name, season,brand,category,price,color,created_Date,discount,quantity from Product p where LOWER(p.price) = LOWER(?1)"
,nativeQuery = true) 
public List<Product> findByPrice(String pName);


//- product color (black, brown, white)
@Query(value = "Select product_Id,product_Name, season,brand,category,price,color,created_Date,discount,quantity from Product p where LOWER(p.color) = LOWER(?1)"
,nativeQuery = true) 
public List<Product> findByColor(String pName);

//- date -- latest products (means latest date)
@Query(value = "Select product_Id,product_Name, season,brand,category,price,color,created_Date,discount,quantity from Product p where p.created_Date = ?1"
,nativeQuery = true) 
public List<Product> findByLatestDate(String pName);

}
