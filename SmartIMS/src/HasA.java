
public class HasA {
	Relationship r = new Relationship();
	//creating obj globally
	String cname = "St.Francis College";

	void student() {
		System.out.println("College name:" + cname);
		r.details();
	}

	public static void main(String[] args) {
	
		HasA h = new HasA();
		h.student();
	}
}
