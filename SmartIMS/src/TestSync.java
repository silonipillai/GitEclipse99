
public class TestSync {
	public static void main(String[] args) {
		PrintNumbers obj = new PrintNumbers();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		t1.start();
		t2.start();
	}
}
