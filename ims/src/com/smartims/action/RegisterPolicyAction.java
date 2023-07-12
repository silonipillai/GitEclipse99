package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.PolicyDAO;
import com.smartims.vo.PolicyVO;

public class RegisterPolicyAction {
	Scanner ip = new Scanner(System.in);
	PolicyVO pvo = new PolicyVO();

	void registerPolicy() {
		System.out.println("===============================================================================================================");

		System.out.println("Please Enter Policy Details :");
		System.out.println("Enter Policy Holder ID :");
		pvo.setPh_id(ip.nextInt());

		System.out.println("Enter Term in years :");
		pvo.setTerm(ip.nextFloat());

		System.out.println("Do you want Bodily Injury ? ");
		pvo.setBodily_injury(ip.nextBoolean());

		System.out.println("Do you want Property Damage ? ");
		pvo.setProperty_damage(ip.nextBoolean());

		System.out.println("Do you want Collision Coverage ? ");
		pvo.setCollision(ip.nextBoolean());

		System.out.println("Do you want Comprehensive Coverage ?");
		pvo.setComprehensive(ip.nextBoolean());

		System.out.println("Do you want Medical Coverages ?");
		pvo.setMedical(ip.nextBoolean());

		PolicyDAO pdao = new PolicyDAO();
		pdao.registerPolicy(pvo);
	}

	public static void main(String[] args) {
		RegisterPolicyAction rpa = new RegisterPolicyAction();
		rpa.registerPolicy();
	}
}
