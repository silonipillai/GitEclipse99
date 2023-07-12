package com.insurance.action;

import java.util.Scanner;

public class ScreenAction {
	Scanner ip = new Scanner(System.in);

	void screenvalues() {
		System.out.println("Welcome to insurance Policy!!");

		System.out.println("Please select the below number to perform the operation");
		System.out.println("1.Customer Operations -- 2.Policy Operations -- 3.Payment Operations");
		int opt = ip.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Customer operations:");
			
			System.out.println("1.Display Customer -- 2.Register Customer -- 3.Delete Customer -- 4.Update Customer");
			int cs = ip.nextInt();
			switch (cs) {
			case 1:
				System.out.println("Display Customer By ID:");
				DisplayCustomerAction dca = new DisplayCustomerAction();
				dca.displayById();
				break;
			case 2:
				System.out.println("Register Customer :");
				CusRegistrationAction cra = new CusRegistrationAction();
				cra.registerCus();
				break;

			case 3:
				System.out.println("Delete Customer With ID :");
				DeleteCustomerAction cd = new DeleteCustomerAction();
				cd.deleteAccount();
				break;
			case 4:
				System.out.println("Update Customer");
				UpdateCustomerAction uca = new UpdateCustomerAction();
				uca.updateCustomer();
				break;
			default:
				System.out.println("Invalid input ....");
			}
		break;
		case 2:
			System.out.println("Policy operations :");
			
			System.out.println("1.Display Policy By ID -- 2.Display All Policies -- 3.Register Policy");
			int po = ip.nextInt();
			switch (po) {
			case 1:
				System.out.println("Display Policy By ID :");
				DisplayPolicyAction dpa = new DisplayPolicyAction();
				dpa.displayPolicy();
				break;
			case 2:
				System.out.println("Display All the Policies :");
				DisplayPolicyAction dpa1 = new DisplayPolicyAction();
				dpa1.displayPolicy();
				break;
			case 3:
				System.out.println("Register Policy :");
				RegisterPolicyAction rpa = new RegisterPolicyAction();
				rpa.insertPolicy();
				break;
			default:
				System.out.println("Invalid input ....");
			}
			break;
		case 3:
			System.out.println("Payment operations:");
			
			System.out.println("1.Display Payment -- 2.Register Payment -- 3.Display Customer Details");
			int py = ip.nextInt();
			switch (py) {
			case 1:
				System.out.println("Display Payment By ID :");
				DisplayPaymentAction dpa = new DisplayPaymentAction();
				dpa.displayPayment();
				break;
			case 2:
				System.out.println("Register Payment :");
				RegisterPaymentAction rpa = new RegisterPaymentAction();
				rpa.insertPayment();
				break;
			case 3:
				System.out.println("Display Customer Details with Payments");
				CustomerPaymentAction cpa = new CustomerPaymentAction();
				cpa.paymentAction();
			default:
				System.out.println("Invalid input ....");
			}
		}

	}

	public static void main(String[] args) {
		ScreenAction sa = new ScreenAction();
		sa.screenvalues();
	}
}
