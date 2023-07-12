
public class UsesA {
	int deptno = 78;

	void office() {
		System.out.println("Department num:" + deptno);
		Relationship r = new Relationship();
		// declare object inside method locally
		r.details();
	}

	public static void main(String[] args) {
		UsesA u = new UsesA();
		u.office();
	}
}
