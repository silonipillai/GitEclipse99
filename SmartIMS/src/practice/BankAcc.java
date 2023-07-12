package practice;

import java.util.Scanner;

public class BankAcc {
	void balance() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the bank name:");
		String bank = ip.next();
		if (bank.equalsIgnoreCase("axis")) {
			int bal = 10000;
			int i = 1200;
			System.out.println("Account balance:" + (bal + i));
			System.out.println("Interest is:" + i);

		}
	}

	public static void main(String[] args) {
		BankAcc ba = new BankAcc();
		ba.balance();
	}
}
