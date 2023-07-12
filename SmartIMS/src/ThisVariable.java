
public class ThisVariable {
	int a, b;

	ThisVariable(int a, int b) {
		a = a;
		b = b;

	}

	void display() {
		System.out.println("A:" + a);
		System.out.println("B:" + b);
	}

	public static void main(String[] args) {
		ThisVariable t = new ThisVariable(80, 90);
		t.display();

	}
}
