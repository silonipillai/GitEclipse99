import java.util.Comparator;

public class NameComparator implements Comparator{


	public int compare(Object o1, Object o2) {
	EmployeeCI e1=(EmployeeCI)o1;
	EmployeeCI e2=(EmployeeCI)o2;
	
	return e1.name.compareTo(e2.name);
	}
	

}
