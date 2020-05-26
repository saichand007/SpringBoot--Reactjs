package com.springdemo.Service;

import java.util.List;

import com.springdemo.Modal.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomerList();
	
	public Customer getCustomer(int id);
	
	public void saveCustomer(Customer customer);
	
	public void deleteCustomer(int id);
}
