package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_method {
	public static void main(String[] args) {
		//UnTypeSafe
		ArrayList al = new ArrayList();
		
		al.add("Dhanashree");
		al.add("Pankaj");
		al.add("Dhiraj");
		al.add("Komal");
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);
		}
		
		//TypeSafe
		ArrayList<String> alt = new ArrayList();
		
		alt.add("Dhanashree");
		alt.add("Pankaj");
		alt.add("Dhiraj");
		alt.add("Komal");
		//alt.add(alt);
		
		Iterator itrt = al.iterator();
		while(itrt.hasNext()) {
			Object o = itrt.next();
			System.out.println(o);
		}
		
	}
}
