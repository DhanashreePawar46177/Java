package Collection.Map.Employee_Using_Comparator;

import java.util.Comparator;

public class sortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		int i = e1.getEmpName().compareTo(e2.getEmpName());
		return i;
	}

}
