package com.smartims.functions;

import java.util.Scanner;

import com.smartims.action.RegisterPolicyHolderAction;

public class ProductSelection {
	Scanner ip=new Scanner(System.in);
void product() {
	System.out.println("Please select the product :");
	System.out.println("1.AUTO PERSONAL INSURANCE -- 2.Exit ");
	int pro=ip.nextInt();
	
	if (pro==1) {
			System.out.println("Please Enter Policy Holder Details :");
			RegisterPolicyHolderAction rpha = new RegisterPolicyHolderAction();
			rpha.registerPolicyHolder();
	}		
}
}
