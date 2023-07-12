package com.smartims.vo;

public class CustomerVO {
	int cus_id;
	String cus_name;
	String cus_email;
	long cus_phone;
	String password;

	public int getCus_id() {
		return cus_id;
	}

	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}

	public String getCus_name() {
		return cus_name;
	}

	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}

	public String getCus_email() {
		return cus_email;
	}

	public void setCus_email(String cus_email) {
		this.cus_email = cus_email;
	}

	public long getCus_phone() {
		return cus_phone;
	}

	public void setCus_phone(long cus_phone) {
		this.cus_phone = cus_phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
