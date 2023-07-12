package com.smartims.action;

import java.util.Scanner;

public class ScreenAction {
	Scanner ip = new Scanner(System.in);

	void screenValues() {
		System.out.println("===============================================================================================================");

		System.out.println("                                    Welcome To Insurance");
		System.out.println("===============================================================================================================");

		System.out.println("Please select below options to Login :");
		System.out.println("1.Underwriter Login -- 2.Customer -- 3.Check Status and Premium");
		int opt = ip.nextInt();
		switch (opt) {
		
		case 1:
			System.out.println("UnderWriter Login :");
			LoginUnderWriter lu = new LoginUnderWriter();
			lu.loginUnderWriter();
			
			CheckListAction cla = new CheckListAction();
			cla.checkList();
			
			ReviewPolicyAction rpa = new ReviewPolicyAction();
			rpa.reviewPolicy();
			break;
		case 2:
			System.out.println("CUSTOMER :");
			System.out.println("Are you existing Customer (y / n)?");
			String clog=ip.next();
			if(clog.equalsIgnoreCase("y")) {
				System.out.println("Customer Login :");
				LoginCustomer lc = new LoginCustomer();
				lc.login();
				
				RegisterPolicyHolderAction rpha = new RegisterPolicyHolderAction();
				rpha.registerPolicyHolder();
				
				RegisterVehicleAction rva = new RegisterVehicleAction();
				rva.insertVehicle();
				
				RegisterDriverAction rda=new RegisterDriverAction();
				rda.registerDriver();
				
				RegisterPolicyAction rpa2 = new RegisterPolicyAction();
				rpa2.registerPolicy();
			}
			else {
				System.out.println("Register Customer :");
				RegisterCustomerAction rca = new RegisterCustomerAction();
				rca.registerCustomer();
				
				LoginCustomer lc1 = new LoginCustomer();
				lc1.login();
				
				RegisterPolicyHolderAction rpha1 = new RegisterPolicyHolderAction();
				rpha1.registerPolicyHolder();
				
				RegisterVehicleAction rva1 = new RegisterVehicleAction();
				rva1.insertVehicle();
				
				RegisterDriverAction rda1=new RegisterDriverAction();
				rda1.registerDriver();
				
				RegisterPolicyAction rpa1 = new RegisterPolicyAction();
				rpa1.registerPolicy();
			}
			
			break;
		
		case 3:
			System.out.println("Customer Login :");
			LoginCustomer lc2 = new LoginCustomer();
			lc2.login();
			
			DetailsAction da = new DetailsAction();
			da.displayDetails();
			
			PremiumAction pa = new PremiumAction();
			pa.premium();
			
		default:
			System.out.println("Invalid Option...");
		}
	}

	public static void main(String[] args) {
		ScreenAction sa = new ScreenAction();
		sa.screenValues();
	}
}
