package Collection.ArrayList_with_Encapsulation;

import java.util.ArrayList;
import java.util.Iterator;

public class Main_Class {
	public static void main(String[] args) {
		//ArrayList al = new ArrayList(); //Untypesafe
		ArrayList<Array_List_Class> al = new ArrayList(); //typesafe
		
		Array_List_Class s1 = new Array_List_Class();
		s1.setId(1);
		s1.setName("Dhanshree");
		s1.setBranch("CS");
		
		Array_List_Class s2 = new Array_List_Class();
		s2.setId(2);
		s2.setName("Pranali");
		s2.setBranch("CS");
		
		Array_List_Class s3 = new Array_List_Class();
		s3.setId(3);
		s3.setName("Srushti");
		s3.setBranch("CS");
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("__________________________________________");
		//Untypesafe
		for(Object o:al) {
			System.out.println(o);
		}
		
		System.out.println("__________________________________________");
		//typesafe
		for(Array_List_Class o:al) {
			System.out.println(o);
		}
	}
}
