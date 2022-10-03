package com.sportyshoes.app.repository;



import org.springframework.data.repository.CrudRepository;

import com.sportyshoes.app.model.*;

public interface UserRepository extends CrudRepository<User, Integer>{
	
}
