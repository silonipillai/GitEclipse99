
public class EncapsulationData {
	public static void main(String[] args) {
		Encapsulation d = new Encapsulation();
		d.setId(91);
		d.setName("Siloni");
		d.setAge(23);
		d.setLocation("Hyderabad");
		d.setStatus(true);

		System.out.println("Id:" + d.getId());
		System.out.println("Name:" + d.getName());
		System.out.println("Age:" + d.getAge());
		System.out.println("Location:" + d.getLocation());
		System.out.println("Location:" + d.getStatus());

	}
}
