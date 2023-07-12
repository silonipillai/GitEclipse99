package com.insurance.action;

import java.util.Scanner;

import com.insurance.dao.PolicyDAO;

public class DisplayPolicyAction {
	Scanner ip = new Scanner(System.in);

	void displayPolicy() {
		System.out.println("Display Policy");
		System.out.println("Enter policy ID : ");
		int pid = ip.nextInt();

		PolicyDAO pd = new PolicyDAO();
		pd.displayPolicy(pid);
	}

	public static void main(String[] args) {
		DisplayPolicyAction dpa = new DisplayPolicyAction();
		dpa.displayPolicy();
	}
	

}
