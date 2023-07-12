
public class DBUtility {
	void ctdb(String url, String uname, String pword, int portno) {
		System.out.println("Connected with Oracle");
	}

	void ctdb(String url, float uname, String pword) {
		System.out.println("Connected with Mysql");
	}

	void ctdb(String uname, String pword) {
		System.out.println("Connected with Sybase");
	}

	public static void main(String[] args) {
		DBUtility d = new DBUtility();
		d.ctdb("url", "name", "password", 78);
		d.ctdb("url", 4.5f, "pass");
	}
}
