package utilpackage;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	
	public static void main(String[] args) {
		
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Haaris");
		queue.add("Rifdhan");
		queue.add("Ahmed");
		queue.add("Mafaz");
		queue.add("Hamdhan");
		queue.add("Aspire");
		queue.add("farjana");
		
		System.out.println("Head : "+queue.element());
		System.out.println("Head : "+queue.peek());
		System.out.println("iterating the queue elements..");
		Iterator<String> itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("After removing two elements: ");
		Iterator<String>itr2=queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
