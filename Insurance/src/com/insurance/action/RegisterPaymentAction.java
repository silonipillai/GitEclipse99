package com.insurance.action;

import java.util.Scanner;

import com.insurance.dao.PaymentDAO;
import com.insurance.vo.PaymentVO;

public class RegisterPaymentAction {
	Scanner ip = new Scanner(System.in);
	PaymentVO pvo = new PaymentVO();

	void insertPayment() {
		System.out.println("Insert Payment :");

		System.out.println("Enter payment mode");
		pvo.setMode(ip.next());

		System.out.println("Enter Customer ID");
		pvo.setC_id(ip.nextInt());

		System.out.println("Enter the amount");
		pvo.setPremium(ip.nextInt());

		System.out.println("Enter the policy");
		pvo.setPolicy_id(ip.nextInt());

		PaymentDAO pd = new PaymentDAO();
		pd.registerPayment(pvo);
	}

	public static void main(String[] args) {
		RegisterPaymentAction rpa = new RegisterPaymentAction();
		rpa.insertPayment();

	}

}
