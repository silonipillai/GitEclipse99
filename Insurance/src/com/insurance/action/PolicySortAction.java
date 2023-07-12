package com.insurance.action;

import java.util.Scanner;

import com.insurance.dao.PolicyDAO;

public class PolicySortAction {
	Scanner ip=new Scanner(System.in);
	PolicyDAO pd=new PolicyDAO();
void sortPlan() {
	System.out.println("Sort By :");
	System.out.println("1.Life_Insurance -- 2.Motor_Insurance -- 3.Health_Insurance -- 4.Travel_Insurance");
	int opt=ip.nextInt();
	switch(opt) {
	case 1:
		System.out.println("Life Insurance :");
		
		break;
	case 2:
		System.out.println("Motor Insurance");
		break;
	case 3:
		System.out.println("Health Insurance");
		break;
	case 4:
		System.out.println("Travel Insurance");
		break;
	default:
		System.out.println("Invalid input");
	}
}
}
