package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CompareArray {
	void compare() {
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al2 = new ArrayList<String>();

		al.add("item 1");
		al.add("item 2");
		al.add("item 3");
		al.add("item 4");

		al2.add("item 1");
		al2.add("item 2");
		al2.add("item 3");
		al2.add("item 4");

		System.out.println(" ArrayList1 = " + al);
		System.out.println(" ArrayList2 = " + al2);

		if (al.equals(al2) == true) 
			System.out.println(" Array List are equal");
		 else
			 System.out.println(" Array List are not equal");
		

		System.out.println("\n Lets insert one more item in Array List 1");
		al.add("item 5");

	
		System.out.println(" ArrayList1 = " + al);
		System.out.println(" ArrayList = " + al2);

		
		if (al.equals(al2) == true) 
			System.out.println(" Array List are equal");
		else 
			System.out.println(" Array List are not equal");
		
	}
	void duplicate() {
		ArrayList al=new ArrayList();
		ArrayList al2=new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(3);
		
		al2.add(1);
		al2.add(2);
		al2.add(3);
		
		System.out.println(al);
		System.out.println(al2);
		
		HashSet hs=new HashSet();
		hs.addAll(al);
	}

	public static void main(String[] args) {
		CompareArray ca = new CompareArray();
		ca.compare();
		ca.duplicate();
	}
}
