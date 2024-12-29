package com.tka; // company name

import jakarta.persistence.Entity; // persistence : combination of POJO Class & @Entity
import jakarta.persistence.Id;

@Entity // class level annotation ,using @Entity annotation we can create table
public class Employee { // POJO Class

	@Id // Primary Key in table using this annotation created like here phone
	private long phone;

	private String empname;
	private int age;
	private String address;

	public Employee() {

	}

	public Employee(String empname, int age, long phone, String address) {
		super();
		this.empname = empname;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", age=" + age + ", phone=" + phone + ", address=" + address + "]";
	}

}
