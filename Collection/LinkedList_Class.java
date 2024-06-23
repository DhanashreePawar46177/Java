package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Class {
	public static void main(String[] args) {
		//UnTypeSafe
		LinkedList ll = new LinkedList();
		
		ll.add("Dhanashree");
		ll.add(12);
		ll.add(12.8);
		ll.add("Pawar");
		
		Iterator itr = ll.iterator();
		
		while(itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);
		}
		
		//TypeSafe
		LinkedList<String> ul = new LinkedList();
				
		ul.add("Dhanashree");
		ul.add("Dhiraj");
		ul.add("Pawar");
		//ul.add(89);
				
		Iterator uitr = ll.iterator();
				
		while(uitr.hasNext()) {
			Object o = uitr.next();
			System.out.println(o);
		}
	}
}
