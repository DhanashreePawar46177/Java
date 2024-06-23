package Collection.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map_In_Collection {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap();
		
		hm.put(1,"Dhanu");
		hm.put(2,"Pranali");
		hm.put(3,"Shivani");
		hm.put(4,"Srushti");
		hm.put(5,"Anuja");
		hm.put(6,"Sarika");
		
		
		String s = hm.get(3);
		System.out.println(s);
		
		for(Entry<Integer, String> e:hm.entrySet()) {
			System.out.println(e);
		}
		
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap();
		
		lhm.put(1,"Dhanu");
		lhm.put(2,"Pranali");
		lhm.put(7,"Shivani");
		lhm.put(4,"Srushti");
		lhm.put(9,"Anuja");
		lhm.put(6,"Sarika");
		
		
		String s1 = hm.get(3);
		System.out.println(s1);
		
		for(Entry<Integer, String> e1:lhm.entrySet()) {
			System.out.println(e1);
		}
		
		System.out.println(lhm.containsKey("Dhanu"));
		System.out.println(lhm.containsKey(2));
		
		Set st = lhm.keySet();
		System.out.println(st);
	}
}
