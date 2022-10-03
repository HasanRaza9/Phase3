package com.sportyshoes.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.sportyshoes.app.model.ProductOrder;

public interface ProductOrderRepository extends CrudRepository<ProductOrder,Integer>{

}
