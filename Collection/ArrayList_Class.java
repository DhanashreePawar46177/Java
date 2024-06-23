package Collection;

import java.util.ArrayList;

public class ArrayList_Class {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		//Create
		al.add("Dhanashree");
		al.add("Pankaj");
		al.add("Dhiraj");
		al.add("Komal");
		
		System.out.println(al);
		
		//Read
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		//Update
		al.set(0, "Dhanu");
		System.out.println(al);
		
		//Delete
		al.remove(0);
		System.out.println(al);
		
		//al.add(al);
		al.add(0, "Dhanashree");
		System.out.println(al);
		
		//al.addAll(al);
		//al.clear();
		//System.out.println(al);
		Object o =  al.clone();
		System.out.println(o);
	}
}
