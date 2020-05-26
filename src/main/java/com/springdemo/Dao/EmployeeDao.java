package com.springdemo.Dao;

import java.util.List;

import com.springdemo.Modal.Employee;

public interface EmployeeDao {

	public List<Employee> getEmployeeList();
	
	public Employee getEmployee(int id);
	
	public void saveEmployee(Employee employee);
	
	public void deleteEmployee(int id);
	
	
}
