package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_Queue {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		
		pq.add(987);
		pq.add(98);
		pq.add(4565);
		
		System.out.println(pq);
		
		Iterator itr = pq.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
