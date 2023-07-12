package com.insurance.action;

import java.util.Scanner;

import com.insurance.dao.PolicyDAO;
import com.insurance.vo.PolicyVO;

public class RegisterPolicyAction {
	Scanner ip = new Scanner(System.in);
	PolicyVO pvo = new PolicyVO();

	void insertPolicy() {
		System.out.println("Policy Registeration:");

		System.out.println("Enter policy ID:");
		pvo.setPolicy_id(ip.nextInt());
		
		System.out.println("Enter Plan Name:");
		pvo.setPlan_name(ip.next());

		System.out.println("Enter Plan type :");
		pvo.setPlan_type(ip.next());

		System.out.println("Enter policy term(in years) :");
		pvo.setPolicy_term(ip.nextFloat());

		System.out.println("Enter premium amount : ");
		pvo.setPremium(ip.nextInt());;

		PolicyDAO pd = new PolicyDAO();
		pd.registerPolicy(pvo);

	}

	public static void main(String[] args) {
		RegisterPolicyAction rpa = new RegisterPolicyAction();
		rpa.insertPolicy();
	}
}
