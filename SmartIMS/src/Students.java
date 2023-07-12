import java.io.Serializable;

public class Students implements Serializable {
	int id;
	String name;

	public Students(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
