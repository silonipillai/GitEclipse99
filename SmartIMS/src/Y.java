
public class Y extends X {
	void m2() {
		super.m2();
		System.out.println("Pillai");
	}

	@Override
	void m1() {
		// TODO Auto-generated method stub
super.m2();
	}
	

	public static void main(String[] args) {
		X x = new Y();
		x.m2();
		x.m1();
		
	}
}
