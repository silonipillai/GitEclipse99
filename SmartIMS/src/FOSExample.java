import java.io.FileOutputStream;

public class FOSExample {
void writeIntoFile() {
	try {
	FileOutputStream fout=new FileOutputStream("E:\\java\\Greetings.text");
	String s="good morning";//data to be stored inside file
	
	byte b[]=s.getBytes();
	fout.write(b);
	fout.close();
	System.out.println("success");
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
public static void main(String[] args) {
	FOSExample f=new FOSExample();
	f.writeIntoFile();
}
}
