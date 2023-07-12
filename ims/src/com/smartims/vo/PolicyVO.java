package com.smartims.vo;

public class PolicyVO {
	int policy_id;
	int ph_id;
	float term;
	boolean bodily_injury;
	boolean property_damage;
	boolean collision;
	boolean comprehensive;
	boolean medical;
	String status;

	public int getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}

	public int getPh_id() {
		return ph_id;
	}

	public void setPh_id(int ph_id) {
		this.ph_id = ph_id;
	}

	public float getTerm() {
		return term;
	}

	public void setTerm(float term) {
		this.term = term;
	}

	public boolean isBodily_injury() {
		return bodily_injury;
	}

	public void setBodily_injury(boolean bodily_injury) {
		this.bodily_injury = bodily_injury;
	}

	public boolean isProperty_damage() {
		return property_damage;
	}

	public void setProperty_damage(boolean property_damage) {
		this.property_damage = property_damage;
	}

	public boolean isCollision() {
		return collision;
	}

	public void setCollision(boolean collision) {
		this.collision = collision;
	}

	public boolean isComprehensive() {
		return comprehensive;
	}

	public void setComprehensive(boolean comprehensive) {
		this.comprehensive = comprehensive;
	}

	public boolean isMedical() {
		return medical;
	}

	public void setMedical(boolean medical) {
		this.medical = medical;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
