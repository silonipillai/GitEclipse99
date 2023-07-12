import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist {
	void readStudentObj() {
		try {
			FileInputStream fin = new FileInputStream("E:\\java\\Greetings.text");
			ObjectInputStream in = new ObjectInputStream(fin);
			Students s = (Students) in.readObject();
			System.out.println("id:" + s.id);
			System.out.println("Name:" + s.name);
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Depersist d = new Depersist();
		d.readStudentObj();
	}
}
