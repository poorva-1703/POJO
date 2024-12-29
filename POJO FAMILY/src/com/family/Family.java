package com.family;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Family {

	@Id
	private long phone;

	private String fname;
	static private String lname;
	private int age;

	public Family() {

	}

	public Family(long phone, String fname, int age) {
		super();
		this.phone = phone;
		this.fname = fname;
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public static String getLname() {
		return lname;
	}

	public static void setLname(String lname) {
		Family.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Family [phone=" + phone + ", fname=" + fname + ", age=" + age + "]";
	}

}
