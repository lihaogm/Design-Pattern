package com.lihaogn.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;
	
	public Employee(String name,String dept,int sal) {
		this.name=name;
		this.dept=dept;
		this.salary=sal;
		subordinates=new ArrayList<>();
	}
	
	public void add(Employee employee) {
		subordinates.add(employee);
	}
	
	public void remove(Employee employee) {
		subordinates.remove(employee);
	}
	
	public List<Employee> getSubordinates() {
		return subordinates;
	}
	
	@Override
	public String toString() {
		return ("employee: [ name: "+name+",dept :"+dept+", salary: "+salary+" ]");
	}
}
