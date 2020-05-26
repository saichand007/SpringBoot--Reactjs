package com.springdemo.Controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.Modal.Employee;
import com.springdemo.Service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee> getList()
	{	
		return employeeService.getEmployeeList();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable int id)
	{	
		Employee employee= employeeService.getEmployee(id);
		
		if (employee == null) {
			throw new RuntimeException("Employee id not found - " + id);
		}
		
		return employee;
	}
	
	@PostMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee)
	{	
		employeeService.saveEmployee(employee);
		
		return  employee;
	}
	
	@PutMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee)
	{	
		employeeService.saveEmployee(employee);
		
		return employee;
	}
	
	@DeleteMapping("employee/{id}")
	public void deleteEmployee(@PathVariable int id)
	{	
		
		Employee employee= employeeService.getEmployee(id);
		
		if (employee == null) {
			throw new RuntimeException("Employee id not found - " + id);
		}
		
		employeeService.deleteEmployee(id);
	}
	
	

}
