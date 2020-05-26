package com.springdemo.Service;

import java.util.List;

import com.springdemo.Modal.Employee;

public interface EmployeeService {

	public List<Employee> getEmployeeList();
	
	public Employee getEmployee(int id);
	
	public void saveEmployee(Employee employee);
	
	public void deleteEmployee(int id);
}
