
public class Thread1 extends Thread {
	PrintNumbers p = new PrintNumbers();

	Thread1(PrintNumbers p) {
		this.p = p;
	}

	public void run() {
		p.printNumbers(5);
	}
}
