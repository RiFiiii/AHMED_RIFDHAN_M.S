package assignment2;

public class StringDemoAndMethods {

	
	public static void main(String[] args) {
		String s="Hello World";
		String s1="b";
		String s2="bc";
		
		
		System.out.println(s.charAt(0));
		System.out.println(s.indexOf('r'));
		System.out.println(s.subSequence(3, 8));
		
		System.out.println(s1.equals(s2));   //always use equals method for string comparison - dont use ==
	}
}
