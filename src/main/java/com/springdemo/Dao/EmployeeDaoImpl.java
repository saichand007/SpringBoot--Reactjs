package com.springdemo.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springdemo.Modal.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDaoImpl(EntityManager theentityManager)
	{
		this.entityManager=theentityManager;
	}
	
	@Override
	public List<Employee> getEmployeeList() {
    
		Session session=entityManager.unwrap(Session.class);
		
		@SuppressWarnings("deprecation")
		Query<Employee> query =session.createQuery("from Employee",Employee.class);
		
		List<Employee> employees= query.getResultList();
		
		return employees;
	}

	@Override
	public Employee getEmployee(int id) {
		
	    Session session=entityManager.unwrap(Session.class);
		
		Employee employee=session.get(Employee.class, id);
		
		return employee;
	}

	@Override
	public void saveEmployee(Employee employee) {
	
	    Session session=entityManager.unwrap(Session.class);
	    
        session.saveOrUpdate(employee);	
		
	}


	@Override
	public void deleteEmployee(int id) {
		
	    Session session=entityManager.unwrap(Session.class);
	    
       Employee employee=session.get(Employee.class, id);
       
       session.delete(employee);
		
	}

}
