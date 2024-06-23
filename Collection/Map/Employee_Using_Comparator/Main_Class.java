package Collection.Map.Employee_Using_Comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Main_Class {
	public static void main(String[] args) {
		HashMap<String, Employee> hm = new HashMap();
		
		Employee e1 = new Employee(11,"Dhanashree", 20000, "Training");
		
		Employee e2 = new Employee();
		e2.setEmpId(12);
		e2.setEmpName("Srushti");
		e2.setSalary(14000);
		e2.setDepartment("HR");
		
		Employee e3 = new Employee(13,"Pranali", 25000, "Student");
		Employee e4 = new Employee(14,"Anuja", 30000, "Management");
		
		String k1 = "abc";
		String k2 = "pqr";
		String k3 = "xyz";
		String k4 = "lmn";
		
		hm.put(k1, e1);
		hm.put(k2, e2);
		hm.put(k3, e3);
		hm.put(k4, e4);
		hm.put("hij", new Employee(16,"Shivani",50000,"Sales"));
		
		System.out.println(hm);
		
		Collection<Employee> c = hm.values();
		
		System.out.println(c);
		
		System.out.println("_____________________________");
		for(Employee emp:c) {
			System.out.println(emp);
		}
		
		ArrayList<Employee> al = new ArrayList(c);
		
		System.out.println("_____________________________");
		for(Employee e:al) {
			System.out.println(e);
		}
		
		System.out.println("______________Sort By Id_______________");
		Collections.sort(al, new sortById());
		for(Employee e : al) {
			System.out.println(e);
		}
		
		System.out.println("______________Sort By Name_______________");
		Collections.sort(al, new sortByName());
		for(Employee e : al) {
			System.out.println(e);
		}
		
		System.out.println("______________Sort By Salary_______________");
		Collections.sort(al, new sortBySalary());
		for(Employee e : al) {
			System.out.println(e);
		}
		
		System.out.println("______________Sort By Department_______________");
		Collections.sort(al, new sortByDept());
		for(Employee e : al) {
			System.out.println(e);
		}
	}
}
