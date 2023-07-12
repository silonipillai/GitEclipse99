
public class MySingleTon {
private static MySingleTon myObj;
private MySingleTon() {
	//creating constructor as private cannot be accessed outside
	System.out.println("Siloni");
}
public static MySingleTon getInstance() {
	if(myObj==null) {
		myObj=new MySingleTon();
	}
	return myObj;
}
public void getSomeThing() {
	System.out.println("i am here");
}
public static void main(String[] args) {
	MySingleTon st=MySingleTon.getInstance();
	st.getSomeThing();
}
}
