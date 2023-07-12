package com.insurance.action;

import com.insurance.dao.PolicyDAO;

public class DisplayAllPolicies {
	void displayAll() {
		System.out.println("All the Policies are :");

		PolicyDAO pd = new PolicyDAO();
		pd.displayAll();
	}

	public static void main(String[] args) {
		DisplayAllPolicies dap = new DisplayAllPolicies();
		dap.displayAll();
	}
}
