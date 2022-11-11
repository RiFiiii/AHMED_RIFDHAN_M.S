package jdk5to18;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringDemo2 {

	public static void main(String[] args) {
		String s="Hello World"; // this will create one object..
		String ss=new String("Hello World"); // this will create two objects..
		
		//String is non mutable
		String temp=s;
		
		
		System.out.println(s);
		System.out.println(ss);
		
		s=s+" Hai World";
		
		System.out.println(s);
		System.out.println("Old String Object..:"+temp);
	
		System.out.println(s.substring(1, 8));
		System.out.println(s.charAt(8));
		System.out.println(s.indexOf('i'));
	
		StringBuilder sb=new StringBuilder("Hello");
		StringBuilder temp2=sb;
		System.out.println(temp2);
		
		StringJoiner sj=new StringJoiner(",");
		sj.add("Ahmed");
		sj.add("Rifdhan");
		System.out.println(sj);
		
		StringTokenizer st=new StringTokenizer(sj.toString(),",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	
		
		System.out.printf("\n%s\t%-20d%.1f\t%s","hello",122,433,122.666f," World ");
	
	}
}
