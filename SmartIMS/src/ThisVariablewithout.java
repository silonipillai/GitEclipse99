
public class ThisVariablewithout {
	int p, q;

	ThisVariablewithout(int a, int b) {
		p = a;
		q = b;

	}

	void display() {
		System.out.println("A:" + p);
		System.out.println("B:" + q);
		try {
			
		}
		finally {
			
		}
	}

	public static void main(String[] args) {
		ThisVariablewithout t = new ThisVariablewithout(80, 90);
		t.display();

	}
}
