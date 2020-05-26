package com.springdemo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.Dao.SpringDataJpaIntrfce;
import com.springdemo.Modal.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private SpringDataJpaIntrfce springDataJpaDao;

	@Override
	public List<Customer> getCustomerList() {
		
		return springDataJpaDao.findAll();
	}

	@Override
	public Customer getCustomer(int id) { 
			Optional<Customer> result=springDataJpaDao.findById(id);
			
			Customer customer = null;
			
			if (result.isPresent()) {
				customer = result.get();
			}
			else {
				// we didn't find the employee
				throw new RuntimeException("Did not find employee id - " + id);
			}
			
				
				return customer;
	}

	@Override
	public void saveCustomer(Customer customer) {
		springDataJpaDao.save(customer);
		
	}

	@Override
	public void deleteCustomer(int id) {
		springDataJpaDao.deleteById(id);
		
	}

}
