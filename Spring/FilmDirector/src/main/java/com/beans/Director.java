package com.beans;

public class Director {

	public Director() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	private String fname;
	private String lname;
	private int age;
	public Director(String fname, String lname, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
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
	@Override
	public String toString() {
		return "Director [fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}
	
	

}
