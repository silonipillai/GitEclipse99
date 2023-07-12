import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorInterface {
void employeeList() {
	ArrayList al=new ArrayList();
	al.add(new EmployeeCI(45,"Siloni",23));
	al.add(new EmployeeCI(91,"Pillai",25));
	al.add(new EmployeeCI(67,"Padma",45));
	
	System.out.println("Sort by Id:");
	Collections.sort(al,new IdComparator());
	Iterator itr=al.iterator();
	while(itr.hasNext()) {
		EmployeeCI ec=(EmployeeCI)itr.next();
		System.out.println("Id"+ec.id+"Name:"+ec.name+"Age:"+ec.age);
	}
	
	System.out.println("Sort by Name:");
	Collections.sort(al,new NameComparator());
	Iterator itr1=al.iterator();
	while(itr1.hasNext()) {
		EmployeeCI ec=(EmployeeCI)itr1.next();
		System.out.println("Id"+ec.id+"Name:"+ec.name+"Age:"+ec.age);
	}
	
	System.out.println("Sort by Age:");
	Collections.sort(al,new AgeComparator());
	Iterator itr2=al.iterator();
	while(itr2.hasNext()) {
		EmployeeCI ec=(EmployeeCI)itr2.next();
		System.out.println("Id"+ec.id+"Name:"+ec.name+"Age:"+ec.age);
	}
	
}
public static void main(String[] args) {
	ComparatorInterface ci=new ComparatorInterface();
	ci.employeeList();
}
}
