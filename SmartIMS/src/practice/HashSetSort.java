package practice;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetSort {
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
		System.out.println(hs);
	}

	public static void main(String[] args) {
		HashSetSort h=new HashSetSort();
		h.duplicate();
	}
}
