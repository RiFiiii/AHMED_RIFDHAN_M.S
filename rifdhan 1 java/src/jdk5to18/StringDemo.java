package jdk5to18;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringDemo {

	public static void main(String[] args) {
		
		String s="Hello World";
		String ss=new String("hello world"); // more memory
		
		if(s.equals(ss)) {
			System.out.println("Both the strings are equal");
			
		}
		else {
			System.out.println("The Strings are not same..");
		}
		
		
		System.out.println(s.substring(2));
		System.out.println(s.charAt(3));
		System.out.println(s.indexOf('l'));
	
		System.out.println(s.contains("World"));
		
		System.out.println(String.join("-------", "Hello ","Vanakkam"));
	
		String x="   hell.....";
		System.out.println(x);
		
		System.out.println(x.trim());
		
		StringJoiner joinstr=new StringJoiner("-");
		System.out.println(joinstr);
		joinstr.add("Hello");
		joinstr.add("Vanakkam");
		joinstr.add("Bye");
		
		System.out.println(joinstr);
	
		
		joinstr=new StringJoiner("-","[","]");
		joinstr.add("bye dude");
		joinstr.add("poituvarean macha");
		System.out.println(joinstr);
		
		StringTokenizer st=new StringTokenizer("Hello-World","-");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		String temp=s;
		s=s+" ello world";
		System.out.println(s);
		System.out.println(temp);
	
		StringBuffer sbf=new StringBuffer("My buffer value "); // synchronized
		sbf.append("World");   // append is add the value at the end...
		System.out.println(sbf );
	
		StringBuilder sbb=new StringBuilder("String builder String");
		sbb.append(" World ..........");
	System.out.println(sbb);
	}
}
