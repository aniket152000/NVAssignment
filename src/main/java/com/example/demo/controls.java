package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Users;
import com.example.services.Services;

@RestController
public class controls {
	@Autowired
	public Services services;
	
	@GetMapping("/users")
	public List<Users> getUsers(){
		return this.services.getAllusers();
	}
	
	@GetMapping("/users/{id}")	 
	public Users getusersbyid(@PathVariable("id") int id) {
		
		return services.getusersid(id);		
	}
	
	@PostMapping("/users")      
	public Users adduser(@RequestBody Users user) {
		Users u = this.services.adduser(user);
		return u;
	}
	
	@DeleteMapping("/users/{userid}")     
	public void deleteuser(@PathVariable("userid") int userid) {
		services.deleteUser(userid);
		
	}
	
	@PutMapping("users/{userid}")
	public Users updatebook(@RequestBody Users users,@PathVariable("userid") int userid) {
		this.services.updateUserData(users, userid);
		return users;
	}
	
}
