
public class PrintNumbers {
	void printNumbers(int p) {
		synchronized (this) {
			for (int i = 0; i <= p; i++) {
				System.out.println("Value of i : " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
					System.out.println(ie);
				}
			}
		}
	}
}
