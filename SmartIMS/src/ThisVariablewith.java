
public class ThisVariablewith {
int a,b;
void num(int a,int b) {
	this.a=a;
	this.b=b;
	System.out.println("A:"+a);
	System.out.println("B:"+b);
}
public static void main(String[]args) {
	ThisVariablewith v=new ThisVariablewith();
	v.num(66, 77);
	
}
}
