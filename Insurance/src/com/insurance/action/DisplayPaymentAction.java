package com.insurance.action;

import java.util.Scanner;

import com.insurance.dao.PaymentDAO;

public class DisplayPaymentAction {
	Scanner ip=new Scanner(System.in);
void displayPayment() {
	System.out.println("Display Payment Details :");
	System.out.println("Enter Customer ID :");
	int cid=ip.nextInt();
	
	PaymentDAO pa=new PaymentDAO();
	pa.displayPayByID(cid);
}
	public static void main(String[] args) {
		DisplayPaymentAction dpa=new DisplayPaymentAction();
		dpa.displayPayment();

	}

}
