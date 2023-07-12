
public class StringExample {
	String a = "Siloni";
	String n = new String("Siloni");
	String b = "Where are you?";

	void func() {
		System.out.println("Comparing address:" + (a == n));
		System.out.println("Character at index num" + a.charAt(4));
		System.out.println("Length of the string:" + a.length());
		System.out.println("SubString:" + n.substring(0, 3));
		System.out.println("Contains:" + b.contains("you"));
		String c = a.concat("Welcome Home!");
		System.out.println("Concat:" + c);
		System.out.println("Is empty?" + n.isEmpty());
		c = b.replace("you", "we");
		System.out.println("Replace" + c);
		System.out.println("Trim:" + b.trim());
		String d = b.intern();
		System.out.println("Copy data:" + d);
		System.out.println("Upper Case:" + n.toUpperCase());
		System.out.println("Starts with:" + a.startsWith("i"));
		System.out.println("Ends with:" + b.endsWith("?"));

		System.out.println("Equals:" + a.equals(n));
		System.out.println("Compare to:" + b.compareTo(n));
		String e = "Pillai";

	}

	public static void main(String[] args) {
		StringExample se = new StringExample();
		se.func();
	}
}
