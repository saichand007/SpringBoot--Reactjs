package com.springdemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.Modal.Customer;
import com.springdemo.Service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customer")
	public List<Customer> getList()
	{	
		return customerService.getCustomerList();
	}
	
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable int id)
	{	
		Customer customer= customerService.getCustomer(id);
		
		if (customer == null) {
			throw new RuntimeException("Customer id not found - " + id);
		}
		
		return customer;
	}
	
	@PostMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer)
	{	
		customerService.saveCustomer(customer);
		
		return  customer;
	}
	
	@PutMapping("/customer")
	public Customer saveCustomer(@RequestBody Customer customer)
	{	
		customerService.saveCustomer(customer);
		
		return customer;
	}
	
	@DeleteMapping("customer/{id}")
	public void deleteCustomer(@PathVariable int id)
	{	
		
		Customer customer= customerService.getCustomer(id);
		
		if (customer == null) {
			throw new RuntimeException("Customer id not found - " + id);
		}
		
		customerService.deleteCustomer(id);
	}
	
	
}
