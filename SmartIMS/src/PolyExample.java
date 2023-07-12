
public class PolyExample {
	void m1() {
		System.out.println("no parameters");
	}

	void m1(String name) {
		System.out.println("name parameter:" + name);
	}

	public static void main(String[] args) {
		PolyExample p = new PolyExample();
		p.m1();
		p.m1("Siloni");
	}
}
