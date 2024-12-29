package com.bank_sys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bank {

	@Id
	private int id;

	private String fname; // fields(Variables)
	private String surname;
	private long acc_no; // fields are private bcz data is coming from frontend
	private float balance;

	public Bank() {

	}

	public Bank(int id, String fname, String surname, long acc_no, float balance) {
		super();
		this.id = id;
		this.fname = fname;
		this.surname = surname;
		this.acc_no = acc_no;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", fname=" + fname + ", surname=" + surname + ", acc_no=" + acc_no + ", balance="
				+ balance + "]";
	}

}
