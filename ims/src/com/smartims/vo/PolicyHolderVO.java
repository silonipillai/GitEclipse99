package com.smartims.vo;

import java.sql.Date;

public class PolicyHolderVO {
	int ph_id;
	String ph_name;
	long phonenum;
	Date dob;
	int age;
	String address;

	public int getPh_id() {
		return ph_id;
	}

	public void setPh_id(int ph_id) {
		this.ph_id = ph_id;
	}

	public String getPh_name() {
		return ph_name;
	}

	public void setPh_name(String ph_name) {
		this.ph_name = ph_name;
	}

	public long getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(long phonenum) {
		this.phonenum = phonenum;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
