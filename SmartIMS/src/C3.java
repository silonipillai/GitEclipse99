
public class C3 extends C2 {
	public void printName() {
		System.out.println("His name is Raggu");
	}

	public static void main(String[] args) {

		C1 a = new C1();
		a.printName();
		
		C2 b = new C2();
		b.printName();
		
		C3 c = new C3();
		c.printName();

	}
}
