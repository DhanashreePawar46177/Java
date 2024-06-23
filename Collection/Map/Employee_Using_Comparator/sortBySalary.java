package Collection.Map.Employee_Using_Comparator;

import java.util.Comparator;

public class sortBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		int i = (int) (e1.getSalary()-e2.getSalary());
		return i;
	}

}
