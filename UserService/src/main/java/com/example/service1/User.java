package com.example.service1;

public class User {

	private String name;
	private Long departmentID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(long departmentID) {
		this.departmentID = departmentID;
	}
	public User(String name, long departmentID) {
		super();
		this.name = name;
		this.departmentID = departmentID;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", departmentID=" + departmentID + "]";
	}
	
}
