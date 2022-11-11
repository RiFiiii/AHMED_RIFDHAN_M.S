package utilpackage;

import java.util.ArrayDeque;
import java.util.Deque;

public class DqueuStack {

	public static void main(String[] args) {
		
		Deque<String> deque=new ArrayDeque<String>();
		deque.offer("ramu");
		deque.offer("raju");
		deque.offer("somu");
		deque.offerFirst("rifdhan");
		System.out.println("Afetr offerFirst Traversal");
		for(String s:deque) {
			System.out.println(s);
		}
		
//		deque.poll();
//		deque.pollFirst(); // it is Same as Poll()
		deque.pollLast();
		
		System.out.println("After PollLast() Traversal..");
			for(String s:deque) {
				System.out.println(s);
			}
	}
}
