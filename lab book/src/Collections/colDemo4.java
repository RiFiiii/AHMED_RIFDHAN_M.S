package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class colDemo4 {

	public static void main(String[] args) {
		 TreeMap<String, String> hmap=new TreeMap<String, String>((s1,s2)->{return s2.compareTo(s1);}); //descending order
		 //HashMap<String, String> hmap=new HashMap<String, String>();
		 hmap.put("a3", "hai");
		 hmap.put("a5", "bye");
		 hmap.put("a7", "guy");
		 hmap.put("a9", "toy");

		  System.out.println(hmap);
		  System.out.println(hmap.get("a7"));
		  Set<Map.Entry<String, String>> set=hmap.entrySet();
		  
		  
		  Iterator<Map.Entry<String, String>> iter=set.iterator();
		  
		  while(iter.hasNext()) {
			Map.Entry<String, String> me=iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
		  }
	}

}
