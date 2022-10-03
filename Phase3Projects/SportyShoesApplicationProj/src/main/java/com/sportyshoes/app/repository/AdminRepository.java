package com.sportyshoes.app.repository;


import org.springframework.data.repository.CrudRepository;

import com.sportyshoes.app.model.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
	

}
