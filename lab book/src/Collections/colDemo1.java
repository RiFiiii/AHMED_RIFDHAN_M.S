package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class colDemo1 {

	public static void main(String[] args) {
		Vector<String> mylist=new Vector<String>();// 1.first we use array list  2.second we edit it as linkedlist no error no changes 3.vector method    it works only for Elements
	mylist.add("abacus");
	mylist.add("bata");
	mylist.add("cat");
	
	  System.out.println(mylist);
	  System.out.println(mylist.get(0));  //we use get key words to give index exchange to get answer
	  
	  mylist.add("dog");
	  
	  System.out.println(mylist);
	  
	  mylist.remove(3);
	  System.out.println(mylist);
	  System.out.println(mylist.contains("bata"));  //contains keyword is used to check is that is available in there
	  System.out.println(mylist.contains("Gta"));
	  
	  //Ascending order does not use comparator 
	  Collections.sort(mylist);
	  
	  System.out.println(mylist);
	  
	  //wheather  descending order use comparator
	  
	  //mylist.sort(new MyComparator()); //this give output ascending and descending order
	  mylist.sort((s1,s2)->{return s2.compareTo(s1);}); // using lambda
	  
	  System.out.println(mylist);
	  
	  for(int i=0;i<mylist.size();i++) {  //method 1
		  System.out.println(mylist.get(i));
	  }
	  for(String s:mylist) {  //method 2
		  System.out.println(s);
	  }
	  Iterator<String> iter=mylist.iterator(); // it is quick performance works like library  iterator use only once after that u again use iterator
	  while(iter.hasNext()) {
		  System.out.println(iter.next()); //iterator is very sensitive.you cannot move backward .iterator is single navigator concern
	  }
	  System.out.println("................");
	  ListIterator<String> liter=mylist.listIterator(); // this is cursor sensitive  because it move it in forward
	  while(iter.hasNext()) {
		  System.out.println(iter.next());
	  }
	  while(liter.hasPrevious()) {
		  System.out.println(liter.previous()); // this is cursor insensitive  because we move it in backward
	  }
	  
	  //works only for vector
	  System.out.println("vectors..............");
	  Enumeration<String> en=mylist.elements(); // Enumerator   elements  only used in vector
	 mylist.add("money");
	  while(en.hasMoreElements()) {
		  System.out.println(en.nextElement());
	  }
 	  //once use retrive iterator you cannot modified the collection if u do so it throw an error
	  
	  //after Enumerator new addition(words)will be write only vector support this facility none that collections does not support
	  
	  //once you retrive iterator you  cannot addition(words)
	}

}
//return always (0 ;1; or -1)

//here we use comparator and override here (o1,o2) ascending order

//here we use comparator and override here (o2,o1) descending order
class MyComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2){
		
		return o2.compareTo(o1);
	}
}
//collections are grouped under hierarchy methods

		/*
		 * there are three types of collections
		 * 1. list collections   -> #Array #List #Vector #Stack #Queue
		 * 2. set collections  ->  #Hashset   #Treeset
		 * 3. map collections  ->  #Hashmap   #TreeMap 
		 * Hierarchical classification help us to understand commonality
		 * 
		 * list collections can have duplicate
		 * set collections cannot have duplicate
		 * map collections can have key attribute or key value
		 */ 
// List collections can have its own advantages
		/*
		 * Most fastest collection is array list  retrival will be very fast
		 * vector all the methods  in vector class are (synchronized)method log automation called for thread safe  		 #Vector by default synchronized method*/
