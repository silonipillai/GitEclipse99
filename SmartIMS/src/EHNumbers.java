
public class EHNumbers {
	int i = 10;
	int j = 0;

	void num() {
		System.out.println("Before Exception");
		try {
			int k = i / j;
			System.out.println("Result :" + k);
		} 
		catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());

		}
		
		finally { 
			System.out.println("Finally is blocked is always printed");
		}
}

	public static void main(String[] args) {
		EHNumbers eh = new EHNumbers();
		eh.num();
	}
}
