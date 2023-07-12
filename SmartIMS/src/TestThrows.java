
public class TestThrows {
int i=10;
int j=0;
void m1() throws ArithmeticException {
	int k=i/j;
	System.out.println(k);
}
void m2() {
	m1();
}
public static void main(String[] args) {
	//complete
}
}
