package com.insurance.vo;

public class PolicyVO {
	int policy_id;
	String plan_name;
	String plan_type;
	float policy_term;
	int premium;

	public int getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}

	public String getPlan_name() {
		return plan_name;
	}

	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}

	public String getPlan_type() {
		return plan_type;
	}

	public void setPlan_type(String plan_type) {
		this.plan_type = plan_type;
	}

	public float getPolicy_term() {
		return policy_term;
	}

	public void setPolicy_term(float policy_term) {
		this.policy_term = policy_term;
	}

	public int getPremium() {
		return premium;
	}

	public void setPremium(int premium) {
		this.premium = premium;
	}

}
