
public class FinalExample {
	final int a = 56;
	int b = 89;

	void printValues() {
		// a=a+10;
		System.out.println(a * 10);
		b=b+10;
		
		System.out.println(b * 10);
	}

	public static void main(String[] args) {
		FinalExample f = new FinalExample();
		f.printValues();
	}
}
