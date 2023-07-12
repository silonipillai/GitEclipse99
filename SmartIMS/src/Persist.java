import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {
	void writeStudentObj() {
		try {
			Students s = new Students(45, "Sil");
			FileOutputStream fout = new FileOutputStream("E:\\java\\Greetings.text");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s);
			out.flush();
			out.close();
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Persist p = new Persist();
		p.writeStudentObj();
	}
}
