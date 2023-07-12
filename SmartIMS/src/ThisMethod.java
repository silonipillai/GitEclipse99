
public class ThisMethod {
 void m1() {
	 System.out.println("method one");

 }
 void m2() {
	 System.out.println("method two");
	 this.m1();
 }
 void m3() {
	 System.out.println("method three");
	 this.m2();
 }
 public static void main(String[]args) {
	 ThisMethod t=new ThisMethod();
	 t.m3();
 }
}
