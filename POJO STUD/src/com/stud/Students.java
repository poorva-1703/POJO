package com.stud;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {

	@Id
	private int id;

	private String Fname; // fields(Variables)
	private String Lname;
	private int age; // fields are private bcz data is coming from frontend
	private float marks;

	public Students() {

	}

	public Students(int id, String fname, String lname, int age, float marks) {
		super();
		this.id = id;
		Fname = fname;
		Lname = lname;
		this.age = age;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", age=" + age + ", marks=" + marks
				+ "]";
	}

}
