package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.UnderWriterDAO;

public class ReviewPolicyAction {
	Scanner ip = new Scanner(System.in);

	void reviewPolicy() {
		System.out.println("===============================================================================================================");

		System.out.println("List of Policies are ....");

		UnderWriterDAO uwdao = new UnderWriterDAO();
		uwdao.reviewPolicy();
		
		System.out.println("Enter PolicyHolder ID :");
		int ph_id=ip.nextInt();
		uwdao.checkList(ph_id);
		
		System.out.println("Enter the Status :");
		String status=ip.next();
		
		
		
		System.out.println("Enter Policy ID :");
		int policy_id = ip.nextInt();
		uwdao.updateStatus(status,policy_id);
		
		System.out.println("Do you want to review and update other policies (y or n)?");
		String opt=ip.next();
		if(opt.equalsIgnoreCase("y")) {
			this.reviewPolicy();
		}
		else {
			System.out.println("Thank You For Reviewing Policy Details!!!");
		}
	}

	public static void main(String[] args) {
		ReviewPolicyAction rpa = new ReviewPolicyAction();
		rpa.reviewPolicy();
	}
}
