import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FOSReadWrite {
	void readWriteFile() {

		try {
			FileInputStream fin = new FileInputStream("E:\\java\\Greetings.text");
			FileOutputStream fout = new FileOutputStream("E:\\java\\Morning.text");
			int i;
			while ((i = fin.read()) != -1) {
				fout.write((byte) i);

			}
			System.out.println("success");
			fin.close();
			fout.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		FOSReadWrite f = new FOSReadWrite();
		f.readWriteFile();
	}
}
