import java.util.StringTokenizer;

public class CountWord {
	
	void token() {
		StringTokenizer s = new StringTokenizer("My name is Siloni", " ");
		while (s.hasMoreTokens()) {
			System.out.println(s.nextToken());
			System.out.println(s.countTokens());
		}
		System.out.println(s.countTokens());
	}

	public static void main(String[] args) {
		CountWord cw = new CountWord();
		cw.token();
	}
}
