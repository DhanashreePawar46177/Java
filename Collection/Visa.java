package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Visa {
	public static void main(String[] args) {
		LinkedList KabbadiPlayerList = new LinkedList(); 
		KabbadiPlayerList.add("Dipak");
		KabbadiPlayerList.add("Anup");
		KabbadiPlayerList.add("Mohit");
		
		System.out.println(KabbadiPlayerList);
		
		Vector womenCricketorList = new Vector();
		womenCricketorList.add("aaaa");
		womenCricketorList.add("bbbb");
		womenCricketorList.add("ccc");
		
		System.out.println(womenCricketorList);
		
		Stack menCricketerList = new Stack();
		menCricketerList.add("Dhoni");
		menCricketerList.add("Rohit");
		menCricketerList.add("Virat");
		
		System.out.println(menCricketerList);
		
		List listForVisa = new LinkedList();
		listForVisa.addAll(KabbadiPlayerList);
		listForVisa.addAll(womenCricketorList);
		listForVisa.addAll(menCricketerList);
		
		System.out.println(listForVisa);
		
		Iterator itr = listForVisa.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
