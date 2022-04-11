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

import com.example.entities.Employees;
import com.example.entities.Users;
import com.example.services.EmployeeServices;

@RestController
public class controlsemployees {
	@Autowired
	public EmployeeServices employeeservices;
	
	@GetMapping("/employees")
	public List<Employees> getEmployees(){
		return this.employeeservices.getAllemployees();
	}
	
	@GetMapping("/employees/{id}")	 
	public Employees getemployeesbyid(@PathVariable("id") int id) {
		
		return employeeservices.getemployeesid(id);	
	}
	
	@PostMapping("/employees")      
	public Employees addemployee(@RequestBody Employees employees) {
		Employees e = this.employeeservices.addemployee(employees);
		return e;
	}
	
	@DeleteMapping("/employees/{employeeid}")     
	public void deleteuser(@PathVariable("employeeid") int employeeid) {
		employeeservices.deleteEmployee(employeeid);	
		
	}
	
	@PutMapping("employees/{employeeid}")
	public Users updateemployeedata(@RequestBody Users users,@PathVariable("userid") int userid) {
		this.updateemployeedata(users, userid);
		return users;
	}
	
}
