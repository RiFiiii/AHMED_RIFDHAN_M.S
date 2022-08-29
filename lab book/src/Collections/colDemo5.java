package Collections;

import java.util.HashMap;
import java.util.Map;

import javaGoldenLaps.threadDemo1;

public class colDemo5 {

	public static void main(String[] args) {
		 Map<String, String> hmap=new HashMap<String, String>();

		 	String a1=new String("a1");
		 	String a2=new String("a2");
		 	String a3=new String("a3");
		 	
		 		hmap.put(a1, "ab");
		 		hmap.put(a2, "aa");
		 		hmap.put(a3, "aaa");
		 		
		 		a1=null;
		 		System.gc();
		 		System.out.println(hmap);
	}

}
