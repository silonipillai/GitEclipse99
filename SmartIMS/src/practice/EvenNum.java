package practice;

import java.util.Scanner;

public class EvenNum {
	void even() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0)
				System.out.println("Even number:"+i);
			
		}
	}

	public static void main(String[] args) {
		EvenNum en = new EvenNum();
		en.even();
	}
}
