package com.example.service1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Repository
public class DepartmentRepository {

	static List<Department> list=new ArrayList<Department>();

	static {
		list.add(new Department(1L, "Mech"));
		list.add(new Department(2L, "Com"));
				list.add(new Department(3L, "Civil"));
						list.add(new Department(4L, "Extc"));
				
	}
	public List<Department> getList() {
		return list;
	}

	public void setList(List<Department> list) {
		this.list = list;
	}
	
	
}
