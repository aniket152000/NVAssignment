package com.example.entities;

public class Employees {
	private int id;
	private int userid;
	private String salary;
	private String designation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public Employees(int id, int userid, String salary, String designation) {
		super();
		this.id = id;
		this.userid = userid;
		this.salary = salary;
		this.designation = designation;
	}
	
	@Override
	public String toString() {
		return "Employees [id=" + id + ", userid=" + userid + ", salary=" + salary + ", designation=" + designation
				+ "]";
	}
	
	
}
