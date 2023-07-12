
public class ThDemo1 {
	void th() {
		Thread t2=new Thread();
		t2.start();
		System.out.println("After T2 start:"+t2.isAlive());
	}
public static void main(String[] args) {
	ThDemo1 td=new ThDemo1();
	Thread t=new Thread();
	System.out.println("Before thread is alive or started"+t.isAlive());
	t.start();
	System.out.println("After thread is started"+t.isAlive());
	td.th();
	System.out.println("Completed two threads");
}
}
