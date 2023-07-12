import java.util.Comparator;

public class IdComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		EmployeeCI e1 = (EmployeeCI) o1;
		EmployeeCI e2 = (EmployeeCI) o2;

		if (e1.id == e2.id) {
			return 0;
		} else if (e1.id > e2.id) {
			return 1;
		} else
			return -1;

	}
}
