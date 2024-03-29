package utilpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ColDemo2 {

	public static void main(String[] args) {
		List<Integer>nlist=new ArrayList<>();
		nlist.add(10);
		nlist.add(50);
		nlist.add(400);
		nlist.add(20);
		nlist.add(1000);
		
		System.out.println(nlist);
		Collections.sort(nlist);
		System.out.println(nlist);
		
		Collections.sort(nlist,new MyComparator());
		System.out.println(nlist);
	}
}

class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2.compareTo(o1);
	}
}
