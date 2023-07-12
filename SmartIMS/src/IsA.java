
public class IsA extends Relationship {
	int pin = 500016;

	void display() {
		System.out.println("name:" + name);
		System.out.println("Phone number:" + phnno);
		System.out.println("location:" + location);
		System.out.println("Pin code:" + pin);

	}

	public static void main(String[] args) {
		IsA i = new IsA();
		i.display();

	}
}
