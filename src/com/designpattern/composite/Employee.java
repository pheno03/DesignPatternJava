package com.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name, dept;
	private int salary;
	private List<Employee> subordinates;

	/**
	 * @param name
	 * @param dept
	 * @param salary
	 */
	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();

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

	public String toString() {
		return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary + " ]");

	}

}
