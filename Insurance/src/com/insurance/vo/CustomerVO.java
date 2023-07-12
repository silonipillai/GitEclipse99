package com.insurance.vo;

public class CustomerVO {
	int c_id;
	String c_name;
	String c_email;
	long c_phoneno;
	String gender;
	int age;
	boolean marriage_status;
	int policy_id;

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_email() {
		return c_email;
	}

	public void setC_email(String c_email) {
		this.c_email = c_email;
	}

	public long getC_phoneno() {
		return c_phoneno;
	}

	public void setC_phoneno(long c_phoneno) {
		this.c_phoneno = c_phoneno;
	}

	public String isGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMarriage_status() {
		return marriage_status;
	}

	public void setMarriage_status(boolean marriage_status) {
		this.marriage_status = marriage_status;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public int getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}
}
