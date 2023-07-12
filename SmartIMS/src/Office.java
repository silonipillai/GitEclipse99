
public class Office extends Employee {
	void display() {
		int id = identification(456);
		System.out.println("Employee id:" + id);

	}

	void ename() {
		String name = details("Siloni");
		System.out.println("Employee name:" + name);
	}

	public static void main(String[] args) {
		Office o = new Office();
		o.display();
		o.ename();
	}
}
