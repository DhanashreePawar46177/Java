package Collection.Map.Employee_Using_Comparator;

import java.util.Comparator;

public class sortById implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		int i = e1.getEmpId() - e2.getEmpId();
		return i;
	}
	
}
