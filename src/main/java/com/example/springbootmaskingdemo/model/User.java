package com.example.springbootmaskingdemo.model;

public class User {

	private String name;
	private String password;
	private int creditCard;

	public User(String name, String password, int creditCard) {
		this.name = name;
		this.password = password;
		this.creditCard = creditCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", creditCard=" + creditCard + "]";
	}
	
}
