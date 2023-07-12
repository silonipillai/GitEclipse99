import java.util.*;


public class CollectList {
	void collection() {
		Collection c = new ArrayList();
		c.add(1);
		c.add(33);
		c.add(17);
		c.add(23);
		c.add(7);

		System.out.println("ArrayList:" + c);
		//accepts duplicate values
		//maintains insertion order
		Collection c1 = new LinkedList();
		c1.add(1);
		c1.add(33);
		c1.add(17);
		c1.add(23);
		c1.add(7);
		c1.add(1);

		System.out.println("LinkedList:" + c1);
		//duplicate and maintains insertion order
		c.addAll(c1);
		System.out.println("After using addAll method:" + c);

		HashSet hs = new HashSet();
		hs.addAll(c);

		System.out.println("HashSet:" + hs);
		//shuffles the values and no duplicate values

		TreeSet ts = new TreeSet();
		ts.addAll(c1);

		System.out.println("TreeSet:" + ts);
		//Arranges the values in ascending order,no duplicate

		LinkedHashSet lhs = new LinkedHashSet();
		lhs.addAll(c1);

		System.out.println("LinkedHashSet:" + lhs);

	}

	public static void main(String[] args) {
		CollectList cl = new CollectList();
		cl.collection();
	}
}
