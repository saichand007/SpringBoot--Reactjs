package com.springdemo.Modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="tb_emp")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_generator")
	@SequenceGenerator(name="emp_generator", sequenceName = "emp_seq",allocationSize=1)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String Name;
	
	@Column(name="gender")
	private String Gender;
	
	@Column(name="department")
	private String Department;
	
	@Column(name="dob")
	private Date dob;
	
	public Employee() {}
	
	public Employee(String name, String gender, String department, Date dob) {
		super();
		Name = name;
		Gender = gender;
		Department = department;
		this.dob = dob;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Gender=" + Gender + ", Department=" + Department + ", dob="
				+ dob + "]";
	}

   
}
