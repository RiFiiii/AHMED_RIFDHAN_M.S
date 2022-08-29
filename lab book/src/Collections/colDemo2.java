package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class colDemo2 {

	public static void main(String[] args) {
		 Set<String> myset=new TreeSet<String>((s1,s2)->{return s2.compareTo(s1);});
		 
		 myset.add("Apple");
		 myset.add("Mother");
		 myset.add("Chiko");
		 myset.add("Ganga");
 
		 System.out.println(myset);
		 
		 System.out.println(myset.size());// here HashSet not have Get(Index value) option
		 
		 myset.add("Father");
		 
		 System.out.println(myset);
		 
		 myset.remove("Ganga");  // or myset.remove(2); we can't give like this in setcollections
	
		 System.out.println(myset);
		 //Sort method does not work with set
	
		 for(String s:myset) {// this is enhanced for loop method
			 System.out.println(s);
		 }
		 myset.add("Father");
		 Iterator<String> iter=myset.iterator();
		 //myset.add("dsad"); - concurrent modification not allowed
		while(iter.hasNext()) {
			System.out.println(iter.hasNext());

	}
	}
	}
