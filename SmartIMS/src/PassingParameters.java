
public class PassingParameters {
	int c;

	int sum(int a, int b) {
		c = a + b;
		return c;
	}

	void mult() {
		c = sum(12, 14);
		c = c * 10;
		System.out.println("the result is:" + c);
	}

	public static void main(String[] args) {
		PassingParameters p = new PassingParameters();
		p.mult();

	}
}
