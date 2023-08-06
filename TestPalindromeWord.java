package assignment;

import java.util.Scanner;

public class TestPalindromeWord {

	public static void main(String[] args) {
		String str;
//		char cc=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String..:");
		str=sc.next().toUpperCase();
		sc.close();
		
		for(int i=str.length()-1;i>=0;i--) {
			char c=str.charAt(i);
			System.out.print(c);
		}
	}
}
