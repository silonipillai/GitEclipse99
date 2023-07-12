
public class ThisConstructor {
	int id;

	ThisConstructor() {
		this(43);
		System.out.println("Connection established");
		
	}

	ThisConstructor(int id) {
		this.id = id;

	}

	void withdraw() {
		System.out.println("Amount withdrawn");
	}

	void deposit() {
		System.out.println("Amount deposited");
	}

	void pinChange() {
		System.out.println("Pin changed");
	}

	public static void main(String[] args) {
		ThisConstructor t = new ThisConstructor();
		t.withdraw();
		t.deposit();
		t.pinChange();
	}
}
