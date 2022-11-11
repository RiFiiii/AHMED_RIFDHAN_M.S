package jdk5to18;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringJoinerDemo {

	public static void main(String[] args) {
		StringJoiner joinstr=new StringJoiner(",");
		joinstr.setEmptyValue("Its a Empty String..");
//		System.out.println(joinstr);
		
		joinstr.add("hello");
		joinstr.add("hai");
		System.out.println(joinstr);
		
		joinstr=new StringJoiner(",","[","]");
		joinstr.add("hello22");
		joinstr.add("hai222");	
		
		System.out.println(joinstr);
		
		
		StringTokenizer st=new StringTokenizer(joinstr.toString(),",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
	}
}
