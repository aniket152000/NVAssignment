package com.example.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.entities.Employees;

@Service
public class EmployeeServices {
	public static List<Employees>employeelist=new ArrayList<>();
	
	static {
		employeelist.add(new Employees(1,234,"3 lpa","software engineer traniee"));
		employeelist.add(new Employees(2,454,"5 lpa","software engineer"));
		employeelist.add(new Employees(3,134,"9 lpa","manager"));
		employeelist.add(new Employees(4,830,"35 lpa","CEO"));
	}
	
	public List<Employees>getAllemployees(){
		return employeelist;
	}
	
	public Employees getemployeesid(int id) {
		Employees employees=null;
		employees=employeelist.stream().filter(e->e.getId()==id).findFirst().get();
		return employees;
	}
	
	public Employees addemployee(Employees e) {
		employeelist.add(e);
		return e;
	}
	public void deleteEmployee(int empid) {
		employeelist=employeelist.stream().filter(employees -> employees.getId()!=empid).collect(Collectors.toList());
	}
	
	public void updateEmployeeData(Employees employees,int empid ) {
		employeelist=employeelist.stream().map(e->{
			if(e.getId()==empid) {
				e.setDesignation(employees.getDesignation());
			}
			return e;
		}).collect(Collectors.toList());
				
	}
}
