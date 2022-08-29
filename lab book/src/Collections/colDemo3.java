package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class colDemo3 {

	public static void main(String[] args) {
		//Set<question> myset=new HashSet<question>();
		//Set<String> myset=new TreeSet<String>((s1,s2)->{return s2.compareTo(s1);});
		Set<question> myset=new TreeSet<question>((q1,q2)->{return q2.compareTo(q1);});
		 
		 myset.add(new question("who is cm","stalin","kalaingar","1"));
		 myset.add(new question("who is cm1","stalin","kalaingar","1"));
		 myset.add(new question("who is cm2","stalin","kalaingar","1"));
		 myset.add(new question("who is cm3","stalin","kalaingar","1"));
 
		 System.out.println(myset);
		 
		 System.out.println(myset.size());// here HashSet not have Get(Index value) option
		 
		 myset.add(new question("who is cm4","stalin","kalaingar","1"));
		 
		 System.out.println(myset);
		 
		 //myset.remove("Ganga");  // or myset.remove(2); we can't give like this in setcollections
	
		 System.out.println(myset);
		 //Sort method does not work with set
	
		 for(question q:myset) {// this is enhanced for loop method
			 System.out.println(q);
		 }
		 myset.add(new question("who is cm6","stalin","kalaingar","1"));
		 Iterator<question> iter=myset.iterator();
		 //myset.add("dsad"); - concurrent modification not allowed
		while(iter.hasNext()) {
			System.out.println(iter.hasNext());

	}

	}

}


class question implements Comparable<question>{
	String question,o1,o2,ans;
	public question(String question,String o1,String o2,String ans) {
		this.question=question;
		this.o1=o1;
		this.o2=o2;
		this.ans=ans;
	}
	@Override
	public String toString() {
		return "question [question=" + question + ", o1=" + o1 + ", o2=" + o2 + ", ans=" + ans + "]";
	}
	 @Override
	public int compareTo(question o) {
		// TODO Auto-generated method stub
		return question.compareTo(o.question);
	}
	}
	