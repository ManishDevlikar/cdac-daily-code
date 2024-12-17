package com.beans;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String city;
	private int String;
	public Address() {
		super();
	}
	public Address(java.lang.String city, int string) {
		super();
		this.city = city;
		String = string;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getString() {
		return String;
	}
	public void setString(int string) {
		String = string;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", String=" + String + "]";
	}
	
	
}
