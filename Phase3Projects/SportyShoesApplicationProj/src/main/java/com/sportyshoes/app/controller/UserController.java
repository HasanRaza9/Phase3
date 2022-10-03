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

import com.sportyshoes.app.model.User;
import com.sportyshoes.app.repository.UserRepository;

 
@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private UserRepository userRepository; 
		  
	// retrieve all Users from database
		@GetMapping("all")
		public List<User> getAllUsers()
		{
			List<User> user=(List<User>) userRepository.findAll();
			return user;
		}
		
		// insert new User into database
		@PostMapping("add")
		public User addUser(@RequestBody User user)
		{
			return userRepository.save(user);
		}
		
		// get particular User by their ID
		@GetMapping("user/{id}")
		public Optional<User> getUserById(@PathVariable int id)
		{
			return userRepository.findById(id);
		}
		
		// update existing User 
		@PutMapping("update/{id}")
		public User updateUser(@RequestBody User user)
		{
			return userRepository.save(user);
		}
		
		// delete particular student from database
		@DeleteMapping("delete/{id}")
		public void deleteUser(@PathVariable int id)
		{
			userRepository.deleteById(id);
		}

}
