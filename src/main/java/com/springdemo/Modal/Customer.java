package com.springdemo.Modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_generator")
	@SequenceGenerator(name="author_generator", sequenceName = "author_seq",allocationSize=1)
	@Column(name="person_id")
	private int person_id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Override
	public String toString() {
		return "Customer [person_id=" + person_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + "]";
	}
	
	public Customer() {}

	public Customer(String first_name, String last_name, String email) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="last_name")
	private String last_name;
	
	@Column(name="email")
	private String email;
	

}
