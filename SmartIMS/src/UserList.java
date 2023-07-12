import java.util.Scanner;
import java.util.TreeSet;

public class UserList {
	void inputList() {
		Scanner ip = new Scanner(System.in);
		int n;
		System.out.println("Enter the num of values");
		n = ip.nextInt();

		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			array[i] = ip.nextInt();
		}
		System.out.println("Array elements are: ");

		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
            
		}
		TreeSet ts=new TreeSet();
		//ts.addAll(array[i]);
	}

	public static void main(String[] args) {
		UserList ul = new UserList();
		ul.inputList();
	}
}
