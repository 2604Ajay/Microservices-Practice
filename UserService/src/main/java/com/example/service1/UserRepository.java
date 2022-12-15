package com.example.service1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

	static List<User> list=new ArrayList<User>();
	static {
		list.add(new User("Ajay", 1));
		list.add(new User("Sai", 2));
		list.add(new User("Rohan", 3));
		
	}
	public static List<User> getList() {
		return list;
	}
	public static void setList(List<User> list) {
		UserRepository.list = list;
	}
	
}
