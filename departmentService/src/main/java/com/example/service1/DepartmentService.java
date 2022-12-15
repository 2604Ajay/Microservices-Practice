package com.example.service1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repo;
	
	public List<Department> getDepartments(){
		return repo.getList();
	}
	
	public List<Department> addDepartments(Department department){
		List<Department> list=repo.getList();
		list.add(department);
		repo.setList(list);
		return repo.getList();
	}
}
