
public class Encapsulation {
	private int id;
	String name;
	private int age;
	private String location;
	boolean status;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}
	public void setStatus(boolean status) {
		this.status=status;
	}
	public boolean getStatus() {
		return status;
	}
}
