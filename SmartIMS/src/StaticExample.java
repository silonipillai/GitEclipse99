
public class StaticExample {
	static int a = 10;
	static int b = 20;
	static int c;

	static void sum() {
		c = a + b;
		System.out.println("The sum of two numbers is:" + c);
	}

	public static void main(String[] args) {
		StaticExample.sum();

	}

}
