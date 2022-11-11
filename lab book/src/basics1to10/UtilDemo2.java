package basics1to10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class UtilDemo2 {

	public static void main(String[] args) {
		
		
		List<String>list=new ArrayList<String>();  //by making the list specific, you can avoid runtime errors
		
		list.add("Welcome"); //position 0
//		list.add(33423);  //position 1
		list.add("fdasfa"); //Position 2
	
	System.out.println(list.size());  
	
	for(int i=0;i<list.size();i++) {
		String s=list.get(i);
		System.out.println(s.substring(0, 2));
	}
	List<Integer>mylist=new ArrayList<Integer>();
	mylist.add(6769);
	
	//enhanced for loop
	for(String s:list) {
		System.out.println(s);
	}
	// Streams and Method Referencing
	list.stream().forEach(System.out::println);
	
	Iterator<String>iter=list.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	ListIterator<String>liter=list.listIterator();
	while(liter.hasNext()) {
		System.out.println(liter.hasNext());
	}
	while(liter.hasPrevious()) {
		System.out.println(liter.hasPrevious());
	}
	}
}
