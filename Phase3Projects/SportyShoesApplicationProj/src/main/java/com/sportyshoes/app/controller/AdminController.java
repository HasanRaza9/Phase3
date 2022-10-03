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

import com.sportyshoes.app.model.Admin;
import com.sportyshoes.app.repository.AdminRepository;


@RestController
@RequestMapping("admins")
public class AdminController {

	@Autowired
	private AdminRepository adminRepository; 
		  
	// retrieve all Admins from database
		@GetMapping("all")
		public List<Admin> getAllAdmins()
		{
			List<Admin> admin=(List<Admin>) adminRepository.findAll();
			return admin;
		}
		
		// insert new admin into database
		@PostMapping("add")
		public Admin addAdmin(@RequestBody Admin admin)
		{
			return adminRepository.save(admin);
		}
		
		// get particular Admin by their ID
		@GetMapping("admin/{id}")
		public Optional<Admin> getAdminById(@PathVariable int id)
		{
			return adminRepository.findById(id);
		}
		
		// update existing Admin 
		@PutMapping("update/{id}")
		public Admin updateAdmin(@RequestBody Admin admin)
		{
			return adminRepository.save(admin);
		}
		
		// delete particular Admin from database
		@DeleteMapping("delete/{id}")
		public void deleteAdmin(@PathVariable int id)
		{
			adminRepository.deleteById(id);
		}
	
}
