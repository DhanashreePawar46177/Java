package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Class {
	public static void main(String[] args) {
		Set s = new HashSet();
		
		s.add(123);
		s.add(655);
		s.add(876);
		s.add(123);
		System.out.println(s);
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(766);
		lhs.add(233);
		lhs.add(855);
		lhs.add(766);
		System.out.println(lhs);
		
		Iterator itrh = s.iterator();
		while(itrh.hasNext()) {
			System.out.println(itrh.next());
		}
		System.out.println();
		
		Iterator itrlhs = s.iterator();
		while(itrlhs.hasNext()) {
			System.out.println(itrlhs.next());
		}
	}
}
