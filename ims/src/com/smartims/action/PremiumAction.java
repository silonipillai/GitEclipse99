package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.PolicyDAO;

public class PremiumAction {
	Scanner ip=new Scanner(System.in);
	void premium() {
		System.out.println("===============================================================================================================");

		System.out.println("Enter your Policy ID :");
		int policy_id=ip.nextInt();
		//System.out.println("Premium For Your Policy is :");

		PolicyDAO pdao = new PolicyDAO();
		pdao.checkBI(policy_id);
	}

	public static void main(String[] args) {
		PremiumAction pa = new PremiumAction();
		pa.premium();
	}
}
