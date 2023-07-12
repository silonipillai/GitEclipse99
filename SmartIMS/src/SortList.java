import java.util.*;

public class SortList {
	void list() {
		ArrayList al = new ArrayList();
		TreeSet ts = new TreeSet();
		HashSet hs = new HashSet();
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter the values:");
		al.add(ip.nextInt());
		al.add(ip.nextInt());
		al.add(ip.nextInt());
		al.add(ip.nextInt());

		System.out.println("Types of sorting:");
		System.out.println("Insertion order-i");
		System.out.println("Shuffled order-s");
		System.out.println("Ascending order-a");

		String so = ip.next();

		if (so.equalsIgnoreCase("i")) {
			System.out.println(al);
		} else if (so.equalsIgnoreCase("s")) {

			hs.addAll(al);
			System.out.println(hs);
		} else if (so.equalsIgnoreCase("a")) {

			ts.addAll(al);
			System.out.println(ts);
		}
	}

	public static void main(String[] args) {
		SortList sl = new SortList();
		sl.list();
	}
}
