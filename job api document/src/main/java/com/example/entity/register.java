package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class register {
	@Id
	private String email;
	private String username;
	private String password;
	
	public register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public register(String email,String username, String password) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;

	}
	public String getEmail() {
		return email;
	}
	public String getUsername() {
		return username;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "jobs [username=" + username + ", password=" + password + ", email="+ email +"]";
	}
	
	
}
