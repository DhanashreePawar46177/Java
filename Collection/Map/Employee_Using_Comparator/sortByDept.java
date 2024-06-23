package Collection.Map.Employee_Using_Comparator;

import java.util.Comparator;

public class sortByDept implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		int i = e1.getDepartment().compareTo(e2.getDepartment());
		return i;
	}

}
