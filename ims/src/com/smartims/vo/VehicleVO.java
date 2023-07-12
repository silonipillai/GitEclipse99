package com.smartims.vo;

import java.sql.Date;

public class VehicleVO {
	String vin;
	String city;
	String company;
	String model;
	String fuel;
	int cc;
	int reg_yr;
	String type;
	int ph_id;

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getReg_yr() {
		return reg_yr;
	}

	public void setReg_yr(int reg_yr) {
		this.reg_yr = reg_yr;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPh_id() {
		return ph_id;
	}

	public void setPh_id(int ph_id) {
		this.ph_id = ph_id;
	}

}
