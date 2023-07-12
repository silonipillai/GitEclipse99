
public class Thread2 extends Thread {
	PrintNumbers p ;//class declaration

	Thread2(PrintNumbers p) {
		this.p = p;
	}

	public void run() {
		p.printNumbers(10);
	}

}
