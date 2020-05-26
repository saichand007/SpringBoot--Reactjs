package com.springdemo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdemo.Modal.Customer;

public interface SpringDataJpaIntrfce extends JpaRepository<Customer, Integer> {

}
