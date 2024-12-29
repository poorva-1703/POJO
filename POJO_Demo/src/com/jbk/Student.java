package com.jbk;

public class Student { // POJO Class

	private String s_name;       // fields(Variables)
	private int age;             // fields are private bcz data is coming from frontend
	private String Address;

	public Student() {  //Constructor with NO arg 

	}

	public Student(String s_name, int age, String address) {      // Constructor with arg 
		super();
		this.s_name = s_name;
		this.age = age;
		Address = address;
	}


	public String getS_name() { // getter & setter
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {      
		Address = address;
	}
	
	@Override
	public String toString() {     // tostring 
		return "Student [s_name=" + s_name + ", age=" + age + ", Address=" + Address + "]";
	}

}
