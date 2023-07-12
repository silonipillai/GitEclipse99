package com.insurance.action;

import com.insurance.dao.PaymentDAO;

public class CustomerPaymentAction {
	void paymentAction() {
		System.out.println("Details....");

		PaymentDAO pd = new PaymentDAO();
		pd.paymentDetails();
	}

	public static void main(String[] args) {
		CustomerPaymentAction cpa = new CustomerPaymentAction();
		cpa.paymentAction();
	}
}
