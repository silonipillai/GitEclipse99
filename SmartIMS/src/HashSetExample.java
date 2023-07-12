import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
void hashSetList() {
	HashSet hs=new HashSet();
	hs.add(456);
	hs.add(560);
	hs.add(879);
	
	Iterator itr=hs.iterator();
	System.out.println("List ....");

	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
}
public static void main(String[] args) {
	HashSetExample hse=new HashSetExample();
	hse.hashSetList();
}
}

