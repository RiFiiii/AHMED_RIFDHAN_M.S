package assignment;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String..:");
		str=s.next();
		char[] c=str.toCharArray();

		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(c[i]);
		}
		 
		 }
	}
	



