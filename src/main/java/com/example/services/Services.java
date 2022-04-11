package com.example.services;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.entities.Users;

@Service 	
public class Services {
	public static List<Users> userlist=new ArrayList<>();
	
	static {		
		userlist.add(new Users(1,"Aniket","Ghare",898357,"yes","software engineer traniee","active"));
		userlist.add(new Users(2,"rohit","sharma",123354,"yes","cricketer","active"));
		userlist.add(new Users(3,"rohan","verma",528456,"no","jobless","inactive"));
		userlist.add(new Users(4,"elon","musk",528456,"yes","ceo","active"));
	}
	
	public List<Users>getAllusers(){
		return userlist;
	}
	
	public Users getusersid(int id) {
		Users users=null;
		users=userlist.stream().filter(e->e.getId()==id).findFirst().get();
		return users;
	}
	
	public Users adduser(Users b) {
		userlist.add(b);
		return b;
	}
	public void deleteUser(int useid) {
		userlist=userlist.stream().filter(users -> users.getId()!=useid).collect(Collectors.toList());
	}
	
	public void updateUserData(Users users,int userid ) {
		userlist=userlist.stream().map(b->{
			if(b.getId()==userid) {
				b.setFirstname(users.getFirstname());
				b.setLastname(users.getLastname());
			}
			return b;
		}).collect(Collectors.toList());
				
	}
}


