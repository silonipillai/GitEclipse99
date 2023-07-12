package practice;

import java.util.Scanner;

public class SimpleInterest {
void interest() {
	Scanner ip=new Scanner(System.in);
	int si,p,t,r;
	System.out.println("Enter P:");
	p=ip.nextInt();
	System.out.println("Enter T:");
	t=ip.nextInt();
	System.out.println("Enter R:");
	r=ip.nextInt();
	si=(p*t*r)/100;
	System.out.println("Simple Interest:"+si);
}
public static void main(String[] args) {
	SimpleInterest s=new SimpleInterest();
	s.interest();
}
}
