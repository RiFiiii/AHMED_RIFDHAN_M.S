package utilpackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ColDemo3 {

	public static void main(String[] args) {
		List<Student>slist=new LinkedList<>();
		slist.add(new Student("Ram"));
		slist.add(new Student("John"));
		slist.add(new Student("Sham"));
		slist.add(new Student("mafaz"));
		
		System.out.println(slist);
		Collections.sort(slist);
		System.out.println(slist);
		
		Collections.sort(slist,(s1,s2)->{return s2.compareTo(s1);});
		System.out.println(slist);
		
	}
}

class Student implements Comparable<Student>{
	String name;
	public Student(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "The Name is..: "+name+"\n";
	}
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
}