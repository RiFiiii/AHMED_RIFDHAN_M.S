package utilpackage;

import java.util.Map;
import java.util.WeakHashMap;

public class ColDemo6 {

	public static void main(String[] args) {
		
		Map<String, String>hmap=new WeakHashMap<String, String>();
		
		String a1=new String("a1");
		String a2=new String("a2");
		String a3=new String("a3");
		
			hmap.put(a1, "a");
			hmap.put(a2, "aa");
			hmap.put(a3, "aaa");
			
			a1=null;
			System.gc();
			System.out.println(hmap);
	}
}
