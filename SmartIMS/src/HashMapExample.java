import java.util.HashMap;
import java.util.Set;

public class HashMapExample {
	void list() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("TS", "Telangana");
		hm.put("AP", "Andhra Pradesh");
		hm.put("GA", "Goa");
		
		System.out.println(hm);
		Set<String> keys = hm.keySet();
		for (String key : keys) {
			System.out.println("Values of key " + key + " is :" + hm.get(key));
		}
	}

	public static void main(String[] args) {
		HashMapExample hme = new HashMapExample();
		hme.list();
	}
}
