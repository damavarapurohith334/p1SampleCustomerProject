package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerDetailsEntityclass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String email;
	private String password;
	private int failCount ;
	private String status ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getFailCount() {
		return failCount;
	}

	public void setFailCount(int failCount) {
		this.failCount = failCount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public CustomerDetailsEntityclass() {
	}

	public CustomerDetailsEntityclass(int id, String name, String email, String password, int failCount,
			String status) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.failCount = failCount;
		this.status = status;
	}

	@Override
	public String toString() {
		return "CustomerDetailsEntityclass [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", failCount=" + failCount + ", status=" + status + "]";
	}

}
