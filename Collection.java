package advancelabook3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		List<String> li=new ArrayList<String>();
		li.add("Rifdhan");
		li.add("zheem");
		li.add("Ahmed");
		System.out.println(li);
		li.sort(new Comparat());
		System.out.println(li);
		System.out.println();
		List<String> lli=new LinkedList<String>();
		lli.add("Rifdhan");
		lli.add("Zebra");
		lli.add("Ahmed");
		System.out.println();
		System.out.println(lli);
		lli.sort(new Comparat());
		System.out.println(lli);
		System.out.println();
		li.sort((s1,s2)->{return s2.compareTo(s1);});
		System.out.println(li);
		System.out.println();
		Collections.sort(li);
		for(String s:li) {
			System.err.println(s);
			System.out.println();
			//
			Iterator<String> iter=li.iterator();
			while (iter.hasNext()) {
				System.out.println(iter.next());
				
			}
		}
	}
}

// if need to compare to ascending order implement Comparator 

class Comparat implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		
		return o1.compareTo(o2);
	}
}
