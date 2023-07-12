import java.util.StringTokenizer;

public class BufferExample {
	String a = "Pillai";

	void token() {
		StringTokenizer s = new StringTokenizer("I live in Hyderabad", " ");
		while (s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
	}

	void buffer() {
		StringBuffer sb = new StringBuffer("Cat is an animal");
		System.out.println("Append will add:" + sb.append("Parrot"));
		System.out.println("Insert:" + sb.insert(2, "iii"));
		System.out.println("Replace:" + sb.replace(1, 4, "mew.."));
		System.out.println("Delete:" + sb.delete(7, 8));
		System.out.println("Reverse:" + sb.reverse());
		System.out.println("Capacity:" + sb.capacity());
	}

	public static void main(String[] args) {
		BufferExample be = new BufferExample();
		be.token();
		be.buffer();
	}
}
