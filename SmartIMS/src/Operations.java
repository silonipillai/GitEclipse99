
public class Operations {
	int a = 14;
	int b = 18;
	int c;

	void sum() {
		c = a + b;
		System.out.println("The sum of two numbers is:" + c);
	}

	void mult() {
		c = a * b;
		System.out.println("The product of two numbers is" + c);
	}

	void sub() {
		c = a - b;
		System.out.println("The differnce between two numbers is:"+c);
	}

	public static void main(String[] args) {
		Operations op = new Operations();
		op.sum();
		op.sub();
		op.mult();
	}
}
