import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class ArrayListExample {
	void list() {
		ArrayList al = new ArrayList();
		al.add(123);
		al.add(78);
		al.add(67);

		System.out.println("List 1:" + al);

		ArrayList al1 = new ArrayList();

		al1.add(23);
		al1.add(12);
		al1.add(34);
		al1.add(23);
		al.addAll(al1);

		System.out.println("List 2:" + al1);
		System.out.println(al);
		
		HashSet hs=new HashSet();
		hs.addAll(al);
		
		System.out.println("After HashSet:"+hs);
		
		TreeSet ts=new TreeSet();
		ts.addAll(al);
        
		System.out.println("After TreeSet:"+ts);
	}

	public static void main(String[] args) {
		ArrayListExample ale = new ArrayListExample();
		ale.list();
	}
}
