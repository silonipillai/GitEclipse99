package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.PolicyHolderDAO;
import com.smartims.vo.PolicyHolderVO;

public class RegisterPolicyHolderAction {
	Scanner ip = new Scanner(System.in);
	PolicyHolderVO phvo = new PolicyHolderVO();

	public void registerPolicyHolder() {
		System.out.println("===============================================================================================================");

		System.out.println("Regsiter Policy Holder :");

		System.out.println("Enter Policy Holder Name :");
		phvo.setPh_name(ip.next());

		System.out.println("Enter Policy Holder Phone Number :");
		phvo.setPhonenum(ip.nextLong());

		System.out.println("Enter Age :");
		phvo.setAge(ip.nextInt());

		System.out.println("Enter City :");
		phvo.setAddress(ip.next());

		PolicyHolderDAO phdao = new PolicyHolderDAO();
		phdao.insertHolder(phvo);
	}

	public static void main(String[] args) {
		RegisterPolicyHolderAction rpha = new RegisterPolicyHolderAction();
		rpha.registerPolicyHolder();
	}
}
