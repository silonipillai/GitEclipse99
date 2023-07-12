import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	void treeSetList() {
		TreeSet ts = new TreeSet();
		ts.add(456);
		ts.add(897);
		ts.add(12);
        
		Iterator itr = ts.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		TreeSetExample tse = new TreeSetExample();
		tse.treeSetList();
	}
}
