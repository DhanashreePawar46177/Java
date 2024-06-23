package Collection.Map.Sorting_by_RollNo_using_Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main_Class {
	public static void main(String[] args) {
		Student p = new Student();
		Student p1 = new Student();
		Student p2 = new Student();
		
		HashMap<Integer,Student> hm = new HashMap();
		
		p.setRoll_No(1);
		p.setName("Dhanashree");
		p1.setRoll_No(2);
		p1.setName("Srushti");
		p2.setRoll_No(4);
		p2.setName("Anuja");
		
		hm.put(1, p);
		hm.put(7, p1);
		hm.put(5, p2);
		
		System.out.println(hm);
		
		ArrayList<Student> al = new ArrayList(hm.values());
		
		System.out.println(al);
		
		System.out.println("_____________________________");
		for(Student s:al) {
			System.out.println(s);
		}
		
		System.out.println("______________After Sorting_______________");
		Collections.sort(al);
		
		for(Student s:al) {
			System.out.println(s);
		}
	}
}
