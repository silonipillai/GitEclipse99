
public class Th1 extends Thread{
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Value of i : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException ie) {
			System.out.println(ie);
		}
	}
	public static void main(String[] args) {
		Th1 t=new Th1();
		Th1 t2=new Th1();
		t.start();
		t.run();
		t2.start();
		
		
	}
}
