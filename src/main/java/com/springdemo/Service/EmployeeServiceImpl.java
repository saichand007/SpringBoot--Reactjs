package com.springdemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springdemo.Dao.EmployeeDao;
import com.springdemo.Modal.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	@Transactional
	public List<Employee> getEmployeeList() {
	
		return employeeDao.getEmployeeList();
	}

	@Override
	@Transactional
	public Employee getEmployee(int id) {
		
		return employeeDao.getEmployee(id);
	}

	@Override
	@Transactional
	public void saveEmployee(Employee employee) {
		
            employeeDao.saveEmployee(employee);
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {
		
           employeeDao.deleteEmployee(id);
	}

}
