package assignment;

import java.util.Scanner;

public class CountVowelsDigits {

	public static void main(String[] args) {
		
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String..:");
		String str=sc.next().toLowerCase();
		int count=0;
		int digit=0;
		int sp_char=0;
		
		
		
		for(int i=0;i<=str.length()-1;i++) {
			c=str.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
				++ count;
			}else if(c>='0' && c<='9'){
				++ digit;
						
			}else {
				++ sp_char;
			}
		    
		}
		 
		System.out.printf("count of vowels:%d(%.2f%%)%n",count,(double)100*count/str.length());
		System.out.printf("digits:%d(%.2f%%)%n",digit,(double)100*digit/str.length());
		
	}
}
