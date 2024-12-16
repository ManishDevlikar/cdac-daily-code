package com.beans;

public class Director {
	private String fname;
	private String lname;
	private int age;
	@Override
	public String toString() {
		return "Director [fname=" + fname + ", lname=" + lname + "]";
	}
	public Director(String fname, String lname, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	public Director() {
		super();
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
/*
fname (String)
		lname (String)
		age (int)
*/