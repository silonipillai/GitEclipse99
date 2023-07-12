
public class College extends Student1 {
	void collegeDetails() {
		System.out.println("College Details");
		System.out.println("Name: St.Francis College");
		System.out.println("Location: Hyderabad");
		System.out.print("Status: Offline");
	}

	public static void main(String[] args) {
		College c = new College();
		c.collegeDetails();
		System.out.println("");
		System.out.println("_________________________");
		c.details();
		System.out.println("");
		System.out.println("_________________________");
		c.details1();

	}

}
