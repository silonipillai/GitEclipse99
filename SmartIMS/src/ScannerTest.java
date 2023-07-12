import java.util.Scanner;

public class ScannerTest {
void inputFromUser() {
	Scanner sc=new Scanner(System.in);
	System.out.println("User Details....");
	System.out.println("Enter name:");
	String name=sc.next();
	System.out.println("Enter phone number:");
	long phnno=sc.nextLong();
	System.out.println("Enter account no:");
	int ano=sc.nextInt();
	System.out.println("Enter the amount:");
	double a=sc.nextDouble();
	
	System.out.println("Name:"+name);
	System.out.println("Phone number:"+phnno);
	System.out.println("Account number:"+ano);
	System.out.println("Amount:"+a);
	sc.close();
}

public static void main(String[] args) {
	ScannerTest st=new ScannerTest();
	st.inputFromUser();
}

}
