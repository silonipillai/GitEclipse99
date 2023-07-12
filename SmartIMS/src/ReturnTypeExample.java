
public class ReturnTypeExample {
int a=45;
int b=66;
int c;
int sum() {
	c=a+b;
	return c;
}
void mult() {
	c=sum();
	c=c*10;
	System.out.println("The result is:"+c);
	}
public static void main(String []args) {
	ReturnTypeExample r=new ReturnTypeExample();
	r.mult();
}
}
