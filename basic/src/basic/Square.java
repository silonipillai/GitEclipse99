package basic;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number for side of square");
		int side=ip.nextInt();
		for (int i=0; i<side ; i++)  {
			for(int j=0 ; j<side ; j++) {
			System.out.print("*");
			}
			System.out.println("");
		}

	}
}